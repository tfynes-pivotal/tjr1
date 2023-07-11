package com.example.customerprofile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

@SpringBootApplication
@SecurityScheme(type = SecuritySchemeType.APIKEY, name = "api_key", in = SecuritySchemeIn.HEADER)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
