package com.bank.account.application.model;

import com.bank.account.domain.Account;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AccountRepository {

    public Flux<Account> findAll();
    public Mono<Account> findById(String id);
    public Mono<Account> save(Account account);
    public Mono<Account> update(String id, Account account);
    public Mono<Void> delete(String id);

}
