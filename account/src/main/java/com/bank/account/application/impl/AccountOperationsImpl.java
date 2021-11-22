package com.bank.account.application.impl;

import com.bank.account.application.AccountOperations;
import com.bank.account.application.model.AccountRepository;
import com.bank.account.domain.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

//Implementación de las operaciones Account.
@Service
@RequiredArgsConstructor
public class AccountOperationsImpl implements AccountOperations {

    private final AccountRepository repository;

    //Listado
    @Override
    public Flux<Account> queryAll() {
        return repository.getAll();
    }

    //Listado por ID
    @Override
    public Mono<Account> findId(String id) {
        return repository.getId(id);
    }

    //Agregar
    @Override
    public Mono<Account> create(Account account) {
        return repository.save(account);
    }

    //Editar
    @Override
    public Mono<Account> update(String id, Account account) {
        return repository.update(id, account);
    }

    //Eliminar
    @Override
    public Mono<Void> delete(String id) {
        return repository.delete(id);
    }
}
