package com.isgzone.springBootDemo.api;


import com.isgzone.springBootDemo.entity.Product;
import com.isgzone.springBootDemo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/product")
public class ProductApi {
    private final ProductService productService;
    @PostMapping
    public Product save(Product product){
        return productService.save(product);
    }
    @GetMapping
    public List<Product> findAll(){
        return productService.findAll();
    }
    @DeleteMapping
    public void delete(int id){
        productService.deleteById(id);
    }
    @PutMapping("/put/{id}")
    public Product put(@PathVariable ("id") int id,@RequestBody Product product){
        return productService.update(id,product);
    }

}
