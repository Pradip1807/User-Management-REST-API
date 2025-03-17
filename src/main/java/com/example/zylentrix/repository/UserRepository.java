package com.example.zylentrix.repository;

import com.example.zylentrix.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}