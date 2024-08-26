package com.auth.auth.repo;

import com.auth.auth.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo extends CrudRepository<User, Long> {
    public User findUserByUsername(String username);
    public User findUserByEmailAndPassword(String email,String password);
}
