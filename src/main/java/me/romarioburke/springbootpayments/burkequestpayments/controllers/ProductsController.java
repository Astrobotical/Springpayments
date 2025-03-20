package me.romarioburke.springbootpayments.burkequestpayments.controllers;

import me.romarioburke.springbootpayments.burkequestpayments.models.Products.Products;
import me.romarioburke.springbootpayments.burkequestpayments.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {
    private final ProductService productsService;

    public ProductsController(ProductService productsService) {
        this.productsService = productsService;
    }

    @GetMapping
    public ResponseEntity<List<Products>> getAllProducts() {
        List<Products> products = productsService.getAll();
        return ResponseEntity.ok(products);
    }
    @PostMapping("/create")
    public ResponseEntity<Products> createProduct(@RequestBody Products product) {
        Products newProduct = productsService.createProduct(product);
        return ResponseEntity.ok(newProduct);
    }


}
