package com.satyen.productserver.handler;

import java.util.Map;

public record ErrorResponse(
        Map<String, String> errors
) {
}
