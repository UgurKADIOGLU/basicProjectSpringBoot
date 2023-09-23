package com.isgzone.springBootDemo.dao;

import com.isgzone.springBootDemo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer> {
}
