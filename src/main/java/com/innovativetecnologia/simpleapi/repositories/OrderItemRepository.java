package com.innovativetecnologia.simpleapi.repositories;

import com.innovativetecnologia.simpleapi.entities.OrderItem;
import com.innovativetecnologia.simpleapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
