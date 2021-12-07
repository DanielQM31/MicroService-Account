package com.bank.account.infraestructure.repository;

import com.bank.account.infraestructure.model.dao.AccountDao;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

//Interfaz para operaciones CRUD genéricas de Account.
public interface IAccountCrudRepository extends ReactiveCrudRepository<AccountDao, String> {
}
