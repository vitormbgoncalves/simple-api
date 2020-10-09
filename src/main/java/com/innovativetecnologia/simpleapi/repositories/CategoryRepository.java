package com.innovativetecnologia.simpleapi.repositories;

import com.innovativetecnologia.simpleapi.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
