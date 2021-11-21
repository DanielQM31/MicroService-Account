package com.bank.account.application;

import com.bank.account.domain.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductOperations {

    public Flux<Product> queryAll();
    public Mono<Product> findId(String id);
    public Mono<Product> create(Product product);
    public Mono<Product> update(String id, Product product);
    public Mono<Void> delete(String id);

}
