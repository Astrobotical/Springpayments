package me.romarioburke.models;

import jakarta.persistence.*;
import lombok.*;
import me.romarioburke.models.Orders.Order;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Orders")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UID;

    @Column(nullable = false)
    private String firstname;

    @Column(nullable = false)
    private String lastname;

    @Column(nullable = false)
    private String password;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = true)
    private boolean isVerified;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Order> orders = new ArrayList<>();
}
