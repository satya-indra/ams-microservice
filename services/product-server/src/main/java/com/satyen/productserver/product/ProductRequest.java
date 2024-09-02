package com.satyen.productserver.product;

import com.satyen.productserver.category.Category;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.util.UUID;

public record ProductRequest(

        @NotNull(message = "Product name is required")
        Integer id,
        @NotBlank(message = "Product name is required")
        String name,
        String description,
        BigDecimal price,
        @Positive(message = "Product quantity must be greater than 0")
        double availableQuantity,
        @NotNull(message = "Category id is required")
        Integer categoryId

) {
}
