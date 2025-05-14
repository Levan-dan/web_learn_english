package com.example.web_learn_english.service;

import com.example.web_learn_english.model.User;
import com.example.web_learn_english.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public User save(User entity) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }
}
