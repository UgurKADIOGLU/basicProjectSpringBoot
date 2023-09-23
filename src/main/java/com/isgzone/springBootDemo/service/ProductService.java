package com.isgzone.springBootDemo.service;

import com.isgzone.springBootDemo.dao.ProductDao;
import com.isgzone.springBootDemo.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductDao productDao;

    public Product save(Product product) {

        return productDao.save(product);

    }

    public List<Product> findAll() {
        return productDao.findAll();
    }

    public void deleteById(int id) {
        productDao.deleteById(id);
    }

    public void put(Product product) {
        productDao.save(product);
    }

    public Product update(int id, Product product) {
        Optional<Product> product1=productDao.findById(id);
        product1.get().setDistrict(product.getDistrict());
        return productDao.save(product1.get());

    }
}
