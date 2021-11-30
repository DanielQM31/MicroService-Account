package com.bank.account.infraestructure.spring.config;

import com.bank.account.application.model.AccountRepository;
import com.bank.account.infraestructure.repository.AccountCrudRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    //Account
    @Bean
    public AccountRepository repository() {
    return new AccountCrudRepository();
    }

}
