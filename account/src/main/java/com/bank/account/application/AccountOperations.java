package com.bank.account.application;

import com.bank.account.domain.Account;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

//Operaciones con las que se va a trabajar Account.
public interface AccountOperations {

    public Flux<Account> findAll();
    public Mono<Account> findById(String id);
    public Mono<Account> save(Account account);
    public Mono<Account> update(String id, Account account);
    public Mono<Void> delete(String id);

}
