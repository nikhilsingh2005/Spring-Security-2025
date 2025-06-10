package com.nikhil.springsecurity2025.repository;

import com.nikhil.springsecurity2025.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

    Users findByUsername(String username);
}
