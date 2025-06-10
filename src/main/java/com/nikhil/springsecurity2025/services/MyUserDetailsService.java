package com.nikhil.springsecurity2025.services;

import com.nikhil.springsecurity2025.entity.UserPrinciple;
import com.nikhil.springsecurity2025.entity.Users;
import com.nikhil.springsecurity2025.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = userRepository.findByUsername(username);
        if (user == null) {
            System.out.println("No user found with username: " + username);
            throw new UsernameNotFoundException("No user found with username: " + username);
        }
        return new UserPrinciple(user);
    }
}
// $2a$12$NL58X..z9hrrGLQiNIFFleNxsdSr/Qk3rhithTo1ovEoM3UjWX/8y