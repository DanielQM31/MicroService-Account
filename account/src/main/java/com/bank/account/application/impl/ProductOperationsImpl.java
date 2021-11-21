package com.bank.account.application.impl;

import com.bank.account.application.ProductOperations;
import com.bank.account.application.model.ProductRepository;
import com.bank.account.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ProductOperationsImpl implements ProductOperations {

    private final ProductRepository repository;

    @Override
    public Flux<Product> queryAll() {
        return repository.getAll();
    }

    @Override
    public Mono<Product> findId(String id) {
        return repository.getId(id);
    }

    @Override
    public Mono<Product> create(Product product) {
        return repository.save(product);
    }

    @Override
    public Mono<Product> update(String id, Product product) {
        return repository.update(id, product);
    }

    @Override
    public Mono<Void> delete(String id) {
        return repository.delete(id);
    }
}
