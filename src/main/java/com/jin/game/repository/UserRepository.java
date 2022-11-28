package com.jin.game.repository;

import com.jin.game.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByUserEmail(String userEmail);
}