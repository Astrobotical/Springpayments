package me.romarioburke.springbootpayments.burkequestpayments.models.Products;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name ="Products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productID;
    private String name;
    private Double price;
    @Column(nullable = true)
    private String description;
    //Ensures that a product can only have 1 icon
    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private ProductIcon productIcon;

    //Ensures that an Icon can have multiple tags for filtering
    @ManyToMany
    @JoinTable(
            name = "product_tags",
            joinColumns = @JoinColumn(name = "product_ProductID"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private Set<Tag> tags = new HashSet<>();
}