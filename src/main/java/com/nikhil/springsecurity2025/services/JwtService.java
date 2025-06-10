package com.nikhil.springsecurity2025.services;

import org.springframework.stereotype.Service;

@Service
public class JwtService {
    public String generateToken() {
        return "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxM" +
               "jM0NTY3ODkwIiwib" +
               "mFtZSI6Ik5pa2hpbCIsImlhdCI6MTUxNjIzOTAyMn0.LAO" +
               "Y0wNY5QjJmsQNTMSfQvrgHm6wpZcc8uCuC3g06NA";
    }
}
