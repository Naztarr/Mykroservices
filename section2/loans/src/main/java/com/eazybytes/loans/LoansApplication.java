package com.eazybytes.loans;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAware")
@OpenAPIDefinition(
		info = @Info(
				title = "Loans microservice REST API Documentation",
				description = "NaztarBank Loans microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Chinaza Herbert",
						email = "herbertemmanuel116@gmail.com",
						url = "https://github.com/Naztarr/microservices"
				),
				license = @License(
						name = "Apache 2.4",
						url = "https://github.com/Naztarr/microservices"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "NaztarBank Loans microservice REST API Documentation",
				url = "https://github.com/Naztarr/microservices/swagger-ui.html"
		)
)
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}

}
