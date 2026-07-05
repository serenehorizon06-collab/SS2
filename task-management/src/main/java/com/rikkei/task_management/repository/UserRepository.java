package com.rikkei.task_management.repository;

import com.rikkei.task_management.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    private final List<User> users = List.of(
            new User(1L, "nguyenvana", "vana@gmail.com", "USER"),
            new User(2L, "tranthib", "thib@gmail.com", "ADMIN"),
            new User(3L, "leminhc", "minhc@gmail.com", "USER")
    );

    public List<User> findAll() {
        return users;
    }

    public User findById(Long id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }

        return null;
    }
}