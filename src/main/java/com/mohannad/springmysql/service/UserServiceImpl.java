package com.mohannad.springmysql.service;

import com.mohannad.springmysql.model.User;
import com.mohannad.springmysql.repository.UserRepository;
import org.springframework.stereotype.Service;

/**
 * created by mohannad  on 26/10/19
 */
@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}
