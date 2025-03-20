package me.romarioburke.springbootpayments.burkequestpayments.models.Products;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ProductIcons")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class ProductIcon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iconID;

    @Column(nullable = false)
    private String iconPath;

    @OneToOne
    @JoinColumn(name = "product_id", referencedColumnName = "productID", nullable = false)
    private Products product;
}