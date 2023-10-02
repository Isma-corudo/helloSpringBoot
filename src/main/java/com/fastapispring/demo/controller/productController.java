package com.fastapispring.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fastapispring.demo.entities.Department;
import com.fastapispring.demo.entities.Product;

@RestController 
@RequestMapping(value = "/products")
public class productController {
    @GetMapping
    public List<Product> getDepartment(){

        Department department1 = new Department();
        department1.setId(1L);
        department1.setNome("tech");

        Department department2 = new Department(2L, "pet");


        Product product1 = new Product("MecBook Pro", 1L, 4000.0, department1);
        Product product2 = new Product("PC gamer", 2L, 5000.0, department1);
        Product product3 = new Product("Pet House", 3L, 300.0, department2);

        List<Product> listProduct = Arrays.asList(product1, product2, product3);

        return listProduct;
    }
}
