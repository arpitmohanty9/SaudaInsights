package com.SaudaInsights.service;

import com.SaudaInsights.model.Product;
import com.SaudaInsights.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public Iterable<Product> allProducts(){
        return productRepository.findAll();
    }
}
