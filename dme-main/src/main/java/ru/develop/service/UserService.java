package ru.develop.service;

import org.springframework.stereotype.Service;
import ru.develop.entity.User;
import ru.develop.repo.UserRepo;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public List<User> getAll(){
        return userRepo.findAll();
    }

    public User addUser(){
        User user = new User();
        user.setName(UUID.randomUUID().toString());
        return userRepo.save(user);
    }

}
