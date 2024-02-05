package com.SaudaInsights.controller;

import com.SaudaInsights.model.Product;
import com.SaudaInsights.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<Iterable<Product>> getAllProducts() throws Exception {
        try{
            return new ResponseEntity<>(productService.allProducts(), HttpStatus.OK);
        } catch (Exception ex){
            throw new Exception("Unable to return products");
        }
    }


}
