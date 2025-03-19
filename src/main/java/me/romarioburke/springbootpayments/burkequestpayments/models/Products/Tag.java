package me.romarioburke.springbootpayments.burkequestpayments.models.Products;

import jakarta.persistence.*;
import lombok.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Tag")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Tag{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    @ManyToMany(mappedBy = "tags")
    private Set<Products> products = new HashSet<>();
}
