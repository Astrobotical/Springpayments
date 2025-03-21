package me.romarioburke.springbootpayments.burkequestpayments.controllers;

import me.romarioburke.springbootpayments.burkequestpayments.models.Orders.Order;
import me.romarioburke.springbootpayments.burkequestpayments.models.Products.Products;
import me.romarioburke.springbootpayments.burkequestpayments.services.OrderService;
import me.romarioburke.springbootpayments.burkequestpayments.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrdersController {
    private final OrderService orderService;

    public OrdersController(OrderService OrderService) {
        this.orderService = OrderService;
    }

    @GetMapping()
    public ResponseEntity<List<Order>> getAllOrders() {
        List<Order> orders = orderService.getOrdersFromUser(1);
        return ResponseEntity.ok(orders);
    }
}
