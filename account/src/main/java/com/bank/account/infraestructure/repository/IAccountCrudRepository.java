package com.bank.account.infraestructure.repository;

import com.bank.account.infraestructure.model.dao.AccountDao;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface IAccountCrudRepository extends ReactiveCrudRepository<AccountDao, String> {
}
