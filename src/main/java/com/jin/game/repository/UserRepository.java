package com.jin.game.repository;

import com.jin.game.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByUserName(String username);
}