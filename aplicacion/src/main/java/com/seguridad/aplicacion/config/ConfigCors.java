package com.seguridad.aplicacion.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class ConfigCors {

    @Value("${vehiculos.frontend.url}")
    String FRONTEND_URL;

    @Bean
    public WebMvcConfigurer configuracionCors() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/v1/**")
                        .allowedOrigins(FRONTEND_URL)
                        .allowedMethods("*");
            }
        };
    }
}
