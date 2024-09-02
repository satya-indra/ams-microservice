package com.satyen.productserver.product;

import com.satyen.productserver.exception.ProductPurchaseException;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public Integer createProduct(ProductRequest request) {
        Product product = productMapper.toProduct(request);
        return productRepository.save(product).getId();
    }

    public List<ProductPurchaseResponse> purchaseProducts(List<ProductPurchaseRequest> request) {
        // collect the product ids from the request
        var productList = request.stream().map(ProductPurchaseRequest::productId).toList();

        // check if all the products are available
        var storedProducts = productRepository.findAllByIdIn(productList);

        // if the number of stored products is not equal to the number of products in the request
        // then throw an exception
        if (storedProducts.size() != productList.size()) {
            List<Integer> ids = productList.stream()
                    .filter(id -> storedProducts.stream().noneMatch(p -> p.getId().equals(id))).toList();
            throw new ProductPurchaseException("Product not found for Ids : " + ids);
        }

        var purchasedProducts = new ArrayList<ProductPurchaseResponse>();

        // now for each available product, check if the quantity is available
        for (ProductPurchaseRequest productPurchaseRequest : request) {
            Product product = storedProducts.stream()
                    .filter(p -> p.getId().equals(productPurchaseRequest.productId()))
                    .findFirst()
                    .orElseThrow(() -> new EntityNotFoundException("Product not found"));
            if (product.getAvailableQuantity() < productPurchaseRequest.quantity()) {
                throw new ProductPurchaseException("Product insufficient stock available for Id : " + product.getId());
            }
            // if the quantity is available, then make the purchase
            product.setAvailableQuantity(product.getAvailableQuantity() - productPurchaseRequest.quantity());
            productRepository.save(product);

            // add the purchased product to the response
            purchasedProducts.add(productMapper.toProductPurchaseResponse(product, productPurchaseRequest.quantity()));

        }

        return purchasedProducts;
    }

    public ProductResponse findById(Integer id) {
        return productRepository.findById(id)
                .map(productMapper::toProductResponse)
                .orElseThrow(() -> new EntityNotFoundException("Product not found"));
    }

    public List<ProductResponse> findAll() {
        return productRepository.findAll()
                .stream()
                .map(productMapper::toProductResponse)
                .toList();
    }
}
