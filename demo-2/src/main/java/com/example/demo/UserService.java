package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Users addUser(Users user) {
        return userRepository.save(user);
    }

    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    public Users updateUser(Long id, Users userDetails) {
        Users user = userRepository.findById(id).orElseThrow();
        user.setFirstName(userDetails.getFirstName());
        // Set other fields similarly
        return userRepository.save(user);
    }
    public Users addOrUpdateUser(Users user) {
        return userRepository.save(user);
    }
}