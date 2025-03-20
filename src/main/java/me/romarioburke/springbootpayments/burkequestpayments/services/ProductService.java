package me.romarioburke.springbootpayments.burkequestpayments.services;
import me.romarioburke.springbootpayments.burkequestpayments.repositories.ProductsRepository;
import org.springframework.stereotype.Service;
import me.romarioburke.springbootpayments.burkequestpayments.models.Products.Products;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductsRepository productsRepository;

    public ProductService(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public List<Products> getAll(){
        return productsRepository.findAll();
    }
    public Products createProduct(Products product) {
        return productsRepository.save(product);
    }
    public Optional<Products> getProductsByID (long ID){
        return productsRepository.findById(ID);
    }
    public List<Products> getProductsByTag(String tagName) {
        return productsRepository.findByTags_Name(tagName);
    }


}
