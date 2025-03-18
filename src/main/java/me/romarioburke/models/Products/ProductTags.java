package me.romarioburke.models.Products;

import jakarta.persistence.*;
import lombok.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "ProductTags")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class ProductTags {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tagID;

    @Column(unique = true, nullable = false)
    private String name;

    @ManyToMany(mappedBy = "tags")
    private Set<Products> products = new HashSet<>();
}
