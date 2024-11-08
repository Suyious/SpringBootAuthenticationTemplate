package com.xetra.xetra.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xetra.xetra.model.User;

public interface UserRepository extends JpaRepository<User, Long> { 

    Optional<User> findByEmail(String email);
    boolean existsByEmail(String email);

}
