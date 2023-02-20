package com.shop.restcomputershop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication

@EnableJpaRepositories("com.shop.restcomputershop.*")
public class RestComputerShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestComputerShopApplication.class, args);
    }

}
