package com.bank.account.infraestructure.repository;

import com.bank.account.application.model.ProductRepository;
import com.bank.account.domain.Product;
import com.bank.account.infraestructure.model.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class ProductCrudRepository implements ProductRepository {

    @Autowired
    IProductCrudRepository repository;

    @Override
    public Mono<Product> getId(String id) {
        return repository.findById(id)
                .map(this::mapProductDaoToProduct);
    }

    @Override
    public Flux<Product> getAll() {
        return repository.findAll()
                .map(this::mapProductDaoToProduct);
    }

    @Override
    public Mono<Product> save(Product product) {
        return repository.save(mapProductToProductDao(product))
                .map(this::mapProductDaoToProduct);
    }

    @Override
    public Mono<Product> update(String id, Product product) {
        return repository.save(mapProductToProductDao(product))
                .map(this::mapProductDaoToProduct);
    }

    @Override
    public Mono<Void> delete(String id) {
        return repository.deleteById(id);
    }

    private Product mapProductDaoToProduct(ProductDao productDao){
        Product product = new Product();
        product.setId(productDao.getId());
        product.setIdAccount(productDao.getIdAccount());
        product.setIdBusiness(productDao.getIdBusiness());
        product.setIdUser(productDao.getIdUser());
        product.setUserType(productDao.getUserType());
        return product;
    }

    private ProductDao mapProductToProductDao(Product product){
        ProductDao productDao = new ProductDao();
        productDao.setId(product.getId());
        productDao.setIdAccount(product.getIdAccount());
        productDao.setIdBusiness(product.getIdBusiness());
        productDao.setIdUser(product.getIdUser());
        productDao.setUserType(product.getUserType());
        return productDao;
    }

}
