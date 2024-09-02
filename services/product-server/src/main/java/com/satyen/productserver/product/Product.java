package com.satyen.productserver.product;

import com.satyen.productserver.category.Category;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class Product {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String description;
    private BigDecimal price;
    private double availableQuantity;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
