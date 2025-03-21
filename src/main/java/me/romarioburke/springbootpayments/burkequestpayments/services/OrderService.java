package me.romarioburke.springbootpayments.burkequestpayments.services;

import me.romarioburke.springbootpayments.burkequestpayments.models.Orders.Order;
import me.romarioburke.springbootpayments.burkequestpayments.repositories.OrderRepository;
import org.springframework.stereotype.Service;
import me.romarioburke.springbootpayments.burkequestpayments.models.Products.Products;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private final OrderRepository orderRepository;


    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    public List<Order> getOrdersFromUser(long id){ return orderRepository.getAllOrdersForUser(id);}
}
