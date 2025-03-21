package me.romarioburke.springbootpayments.burkequestpayments.models.Orders;


import jakarta.persistence.*;
import me.romarioburke.springbootpayments.burkequestpayments.models.Products.Products;


@Entity
@Table(name = "OrderEntries")
public class OrderEntries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long EntryID;

    @OneToOne
    @JoinColumn(name = "product_id", referencedColumnName = "ProductID", nullable = false)
    private Products product;

    @ManyToOne
    @JoinColumn(name = "order_orderID", nullable = false)
    private Order order;
}
