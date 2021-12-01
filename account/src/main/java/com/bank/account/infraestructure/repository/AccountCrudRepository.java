package com.bank.account.infraestructure.repository;

import com.bank.account.application.model.AccountRepository;
import com.bank.account.domain.Account;
import com.bank.account.infraestructure.model.dao.AccountDao;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class AccountCrudRepository implements AccountRepository {

    @Autowired
    IAccountCrudRepository repository;

    @Override
    public Flux<Account> findAll() {
        return repository.findAll()
                .map(this::mapAccountDaoToAccount);
    }

    @Override
    public Mono<Account> findById(String id) {
        return repository.findById(id)
                .map(this::mapAccountDaoToAccount);
    }

    @Override
    public Mono<Account> save(Account account) {
        return repository.save(mapAccountToAccountDao(account))
                .map(this::mapAccountDaoToAccount);
    }

    @Override
    public Mono<Account> update(String id, Account account) {
        return repository.save(mapAccountToAccountDao(account))
                .map(this::mapAccountDaoToAccount);
    }

    @Override
    public Mono<Void> delete(String id) {
        return repository.deleteById(id);
    }

    private Account mapAccountDaoToAccount(AccountDao accountDao){
        Account account = new Account();
        BeanUtils.copyProperties(accountDao, account);
        return account;
    }

    private AccountDao mapAccountToAccountDao(Account account){
        AccountDao accountDao = new AccountDao();
        BeanUtils.copyProperties(account, accountDao);
        return accountDao;
    }

}
