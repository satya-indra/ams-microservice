package com.satyen.productserver.product;

import com.satyen.productserver.category.Category;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
    public Product toProduct(ProductRequest request) {
        return Product.builder()
                .name(request.name())
                .price(request.price())
                .description(request.description())
                .availableQuantity(request.availableQuantity())
                .category(Category.builder()
                        .id(request.categoryId())
                        .build())
                .build();
    }

    public ProductResponse toProductResponse(Product product) {
        return new ProductResponse(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getAvailableQuantity(),
                product.getCategory().getId(),
                product.getCategory().getName(),
                product.getCategory().getDescription()
        );
    }

    public ProductPurchaseResponse toProductPurchaseResponse(Product product, double quantity) {
        return new ProductPurchaseResponse(
                product.getId(),
                product.getName(),
                quantity,
                product.getPrice(),
                product.getDescription()
        );
    }
}
