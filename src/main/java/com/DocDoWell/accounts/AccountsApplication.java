package com.DocDoWell.accounts;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef="auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Microservice REST API Documentation",
				description = "A contrived Spring Boot Microservice project to demonstrate best practices for REST API, CRUD operations, Validation, Exceptions and Documentation.",
				version = "v1",
				contact = @Contact(
						name = "DocDoWell",
						email = "xxxx@yyyyy.com"
				)
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
