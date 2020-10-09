package com.innovativetecnologia.simpleapi.repositories;

import com.innovativetecnologia.simpleapi.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
