package com.bank.account.infraestructure.repository;

import com.bank.account.infraestructure.model.dao.ProductDao;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

//Interfaz para operaciones CRUD genéricas de Product.
public interface IProductCrudRepository extends ReactiveCrudRepository<ProductDao, String> {



}
