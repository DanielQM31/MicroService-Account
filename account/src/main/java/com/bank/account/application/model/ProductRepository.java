package com.bank.account.application.model;

import com.bank.account.domain.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductRepository {

    public Mono<Product> getId(String id);
    public Flux<Product> getAll();
    public Mono<Product> save(Product product);
    public Mono<Product> update(String id, Product product);
    public Mono<Void> delete(String id);

}
