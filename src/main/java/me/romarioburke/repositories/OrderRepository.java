package me.romarioburke.repositories;

import me.romarioburke.models.Orders.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> getAllOrdersForUser(Long userID); // Find all orders for a user
}
