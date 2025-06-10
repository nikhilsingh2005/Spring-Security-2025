package com.nikhil.springsecurity2025.services;

import com.nikhil.springsecurity2025.entity.Users;

public interface UserService {
    Users save(Users user);

    String verify(Users user);
}
