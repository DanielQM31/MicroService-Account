package com.bank.account.application.model;

import com.bank.account.domain.Account;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AccountRepository {

    public Mono<Account> getId(String id);
    public Flux<Account> getAll();
    public Mono<Account> save(Account account);
    public Mono<Account> update(String id, Account account);
    public Mono<Void> delete(String id);

}
