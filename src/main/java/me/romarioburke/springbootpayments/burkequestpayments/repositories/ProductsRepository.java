package me.romarioburke.springbootpayments.burkequestpayments.repositories;

import me.romarioburke.springbootpayments.burkequestpayments.models.Products.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductsRepository extends JpaRepository<Products, Long> {
    Optional<Products> findByName(String name);
    List<Products> findByTags_Name(String tagName); // Find products by tag name
}
