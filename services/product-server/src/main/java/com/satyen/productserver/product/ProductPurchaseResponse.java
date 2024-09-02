package com.satyen.productserver.product;

import java.math.BigDecimal;

public record ProductPurchaseResponse(
        Integer productId,
        String name,
        double quantity,
        BigDecimal price,
        String description
) {
}
