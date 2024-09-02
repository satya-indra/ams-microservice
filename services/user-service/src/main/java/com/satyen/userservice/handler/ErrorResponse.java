package com.satyen.userservice.handler;

import java.util.Map;

public record ErrorResponse(
        Map<String, String> errors
) {
}
