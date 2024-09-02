package com.satyen.productserver;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Product Server", version = "1.0.0", description = "Documentation API Gateway v1.0"))

public class ProductServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServerApplication.class, args);
	}

}
