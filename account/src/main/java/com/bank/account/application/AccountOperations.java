package com.bank.account.application;

import com.bank.account.domain.Account;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

//Operaciones con las que se va a trabajar Account.
public interface AccountOperations {

    public Flux<Account> queryAll();
    public Mono<Account> findId(String id);
    public Mono<Account> create(Account account);
    public Mono<Account> update(String id, Account account);
    public Mono<Void> delete(String id);

}
