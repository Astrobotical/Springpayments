package me.romarioburke.models.Orders;


import jakarta.persistence.*;
import me.romarioburke.models.Products.Products;


@Entity
@Table(name = "OrderEntries")
public class OrderEntries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long EntryID;


    @OneToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id", nullable = false)
    private Products product;
    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;
}
