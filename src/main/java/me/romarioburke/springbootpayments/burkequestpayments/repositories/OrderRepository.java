package me.romarioburke.springbootpayments.burkequestpayments.repositories;

import me.romarioburke.springbootpayments.burkequestpayments.models.Orders.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    @Query("SELECT o FROM Order o WHERE o.user.id = :userId")
    List<Order> getAllOrdersForUser(@Param("userId") Long userId);

}