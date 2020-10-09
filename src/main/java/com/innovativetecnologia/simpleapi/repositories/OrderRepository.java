package com.innovativetecnologia.simpleapi.repositories;

import com.innovativetecnologia.simpleapi.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
