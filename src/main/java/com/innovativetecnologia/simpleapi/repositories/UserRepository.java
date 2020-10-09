package com.innovativetecnologia.simpleapi.repositories;

import com.innovativetecnologia.simpleapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
