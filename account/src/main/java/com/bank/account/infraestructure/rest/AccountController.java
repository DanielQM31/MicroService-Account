package com.bank.account.infraestructure.rest;


import com.bank.account.application.AccountOperations;
import com.bank.account.domain.Account;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

//Controlador Rest
@Slf4j
@RestController
@RequestMapping("/accounts")
@RequiredArgsConstructor
public class AccountController {

    private final AccountOperations accountOperations;

    //Anotación para obtener todos los registros.
    @GetMapping
    public Flux<Account> get() {
        return accountOperations.queryAll();
    }

    //Anotación para obtener registro por Código.
    @GetMapping("/{id}")
    public Mono<Account> getId(@PathVariable String id){
        return accountOperations.findId(id);
    }

    //Anotación para agregar registros.
    @PostMapping("/add")
    public Mono<Account> post(@Valid @RequestBody Account account){
        if (account == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Campos vacíos");
        }
        return accountOperations.create(account);
    }

    //Anotación para editar los registros.
    @PutMapping("/{id}")
    public Mono<Account> put(@PathVariable String id, @RequestBody Account account){
        return accountOperations.update(id, account);
    }

    //Anotación para eliminar registros.
    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id){
        return accountOperations.delete(id);
    }

}
