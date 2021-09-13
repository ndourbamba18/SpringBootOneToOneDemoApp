package com.parlonsdev.repository;

import com.parlonsdev.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmailContaining(String email);
    Optional<User> findByUsernameContaining(String username);

    Boolean existsByEmail(String email);
    Boolean existsByUsername(String username);
}
