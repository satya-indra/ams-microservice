package com.satyen.productserver.product;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public ResponseEntity<Integer> createProduct(
            @RequestBody ProductRequest request) {

        return ResponseEntity.ok(productService.createProduct(request));
    }

    @PostMapping("/purchase")
    public ResponseEntity<List<ProductPurchaseResponse>> purchaseProduct(
            @RequestBody List<ProductPurchaseRequest> request) {

        return ResponseEntity.ok(productService.purchaseProducts(request));
    }

    @GetMapping("/{productId}")
    public ResponseEntity<ProductResponse> findById(@PathVariable("productId") Integer id) {
        return ResponseEntity.ok(productService.findById(id));
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<ProductResponse>> findAll() {
        return ResponseEntity.ok(productService.findAll());
    }

}
