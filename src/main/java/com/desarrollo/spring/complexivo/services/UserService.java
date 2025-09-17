package com.desarrollo.spring.complexivo.services;

import com.desarrollo.spring.complexivo.models.User;
import com.desarrollo.spring.complexivo.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service

public class UserService {
    @Autowired
    UserRepository repository;

    public User save(User user){
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        return this.repository.save(user);
    }


}
