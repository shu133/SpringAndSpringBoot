package com.tnsif.placementmanagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.placementmanagement.entities.User;
import com.tnsif.placementmanagement.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional

public class UserServiceImpl implements UserService{
	@Autowired
    private UserRepository userRepository;

    private User loggedInUser;

    @Override
    public User createUser(User user) {
        // You can add additional validation logic here if needed
        return userRepository.save(user);
    }

    @Override
    public User login(String username, String password) {
        User user = userRepository.findByUsername(username);

        if (user != null && user.getUserpassword().equals(password)) {
            loggedInUser = user;
            return user;
        } 
        else 
        {
            throw new RuntimeException("Invalid username or password");
        }
    }

    @Override
    public void logout() {
        loggedInUser = null;
    }

}
