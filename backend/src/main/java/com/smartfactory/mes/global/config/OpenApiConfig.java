package com.smartfactory.mes.global.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Smart Factory MES API",
                version = "v1",
                description = "Smart Factory MES backend API documentation.",
                contact = @Contact(name = "Smart Factory MES Team")
        ),
        servers = {
                @Server(url = "http://localhost:8080", description = "Local Server")
        }
)
public class OpenApiConfig {

    @Bean
    public GroupedOpenApi authApi() {
        return GroupedOpenApi.builder()
                .group("auth")
                .packagesToScan("com.smartfactory.mes.auth.controller")
                .build();
    }

    @Bean
    public GroupedOpenApi simulationApi() {
        return GroupedOpenApi.builder()
                .group("simulation")
                .packagesToScan("com.smartfactory.mes.simulation.controller")
                .build();
    }

    @Bean
    public GroupedOpenApi allApi() {
        return GroupedOpenApi.builder()
                .group("all")
                .packagesToScan("com.smartfactory.mes")
                .build();
    }
}
