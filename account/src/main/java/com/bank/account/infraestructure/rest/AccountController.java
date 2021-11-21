package com.bank.account.infraestructure.rest;


import com.bank.account.application.AccountOperations;
import com.bank.account.domain.Account;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/accounts")
@RequiredArgsConstructor
public class AccountController {

    private final AccountOperations accountOperations;

    @GetMapping
    public Flux<Account> get() {
        return accountOperations.queryAll();
    }

    @GetMapping("/{id}")
    public Mono<Account> getId(@PathVariable String id){
        return accountOperations.findId(id);
    }

    @PostMapping("/add")
    public Mono<Account> post(@RequestBody Account account){
        return accountOperations.create(account);
    }

    @PutMapping("/{id}")
    public Mono<Account> put(@PathVariable String id, @RequestBody Account account){
        return accountOperations.update(id, account);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id){
        return accountOperations.delete(id);
    }

}
