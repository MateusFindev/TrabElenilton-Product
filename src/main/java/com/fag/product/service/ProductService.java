package com.fag.product.service;

import com.fag.product.model.Product;
import com.fag.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ResponseEntity<?> save(Product newProduct) {
        return new ResponseEntity<Product>(productRepository.save(newProduct), HttpStatus.OK);
    }

    public ResponseEntity<?> findProductById(Long productId) {
        Product product = productRepository.findById(productId).orElse(null);

        if (product != null) {
            return ResponseEntity.ok(product);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public Iterable<Product> find() {
        return productRepository.findAll();
    }
}
