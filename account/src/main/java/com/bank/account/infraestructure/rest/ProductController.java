package com.bank.account.infraestructure.rest;

import com.bank.account.application.ProductOperations;
import com.bank.account.domain.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductOperations productOperations;

    @GetMapping
    public Flux<Product> get() {
        return productOperations.queryAll();
    }

    @GetMapping("/{id}")
    public Mono<Product> getId(@PathVariable String id) {
        return productOperations.findId(id);
    }

    @PostMapping("/add")
    public Mono<Product> post(@RequestBody Product product){
        return productOperations.create(product);
    }

    @PutMapping("/{id}")
    public Mono<Product> put(@PathVariable String id, @RequestBody Product product){
        return productOperations.update(id, product);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id){
        return productOperations.delete(id);
    }

}
