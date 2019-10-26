package com.mohannad.springmysql.repository;

import com.mohannad.springmysql.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * created by mohannad  on 26/10/19
 */
public interface UserRepository  extends CrudRepository<User, Long> {
}
