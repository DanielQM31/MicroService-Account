package com.bank.account.infraestructure.spring.config;

import com.bank.account.application.model.AccountRepository;
import com.bank.account.application.model.ProductRepository;
import com.bank.account.domain.Product;
import com.bank.account.infraestructure.repository.AccountCrudRepository;
import com.bank.account.infraestructure.repository.ProductCrudRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    /*@Bean
    public AccountRepository repository() {
    return new AccountCrudRepository();
    }*/

    @Bean
    public ProductRepository repository() {
        return new ProductCrudRepository();
    }

}
