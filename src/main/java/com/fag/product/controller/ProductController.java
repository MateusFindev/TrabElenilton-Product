package com.fag.product.controller;

import com.fag.product.model.Product;
import com.fag.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody Product newProduct) {
        return productService.save(newProduct);
    }

    @PutMapping("/alter/{productId}")
    public ResponseEntity<?> alter(@PathVariable Long productId, @RequestBody Product updatedProduct) {
        if (!productId.equals(updatedProduct.getId())) {
            return ResponseEntity.badRequest().body("ID do produto na URL não corresponde ao ID da tarefa no corpo da requisição.");
        }
        return productService.save(updatedProduct);
    }

    @GetMapping("/find/{productId}")
    public ResponseEntity<?> findProductById(@PathVariable Long productId) {
        return productService.findProductById(productId);
    }

    @GetMapping("/find")
    public Iterable<Product> find() {
        return productService.find();
    }

}