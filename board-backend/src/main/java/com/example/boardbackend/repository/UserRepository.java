package com.example.boardbackend.repository;

import com.example.boardbackend.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
