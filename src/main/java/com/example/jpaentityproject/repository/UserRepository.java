package com.example.jpaentityproject.repository;

import com.example.jpaentityproject.task.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
