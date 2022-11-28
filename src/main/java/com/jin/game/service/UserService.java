package com.jin.game.service;

import com.jin.game.model.user.User;
import com.jin.game.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> retrieveALlUsers() {
        return userRepository.findAll();
    }

    public User retrieveUser(Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        return userOptional.orElseThrow(
                ()->new NotFoundException("User with id "+ id + " is not found"));
    }

    public User retrieveUserByUserEmail(String username) {
        return userRepository.findByUserEmail(username).get(0);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(Long id, User user) {
        Optional<User> userOpt = userRepository.findById(id);

        if (!userOpt.isPresent()) {
            throw new NotFoundException("User with id " + id + " is not found");
        }

        user.setId(id);
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
