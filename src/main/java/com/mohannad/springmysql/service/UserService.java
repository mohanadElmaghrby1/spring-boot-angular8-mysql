package com.mohannad.springmysql.service;

import com.mohannad.springmysql.model.User;

/**
 * created by mohannad  on 26/10/19
 */
public interface UserService {

    User save(User user);
    Iterable<User> getAllUsers();
}
