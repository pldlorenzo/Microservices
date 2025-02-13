package com.pdlorenzo.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.pldlorenzo.accounts.controller") })
@EnableJpaRepositories("com.pldlorenzo.accounts.repository")
@EntityScan("com.pldlorenzo.accounts.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "REST API Documentation for Accounts Microservice",
				description = "PDL Bank Accounts Microservice REST API Documentation",
				version = "v1.0.1",
				contact = @Contact(
						name = "Paulo Lorenzo",
						email = "pdlorenzo@sample.com",
						url = "https://www.pdlorenzo.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.pdlorenzo.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description =  "PDL Bank Accounts microservice REST API Documentation",
				url = "https://www.pdlorenzo.com/swagger-ui.html"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
