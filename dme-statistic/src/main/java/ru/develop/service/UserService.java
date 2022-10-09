package ru.develop.service;

import org.springframework.stereotype.Service;
import ru.develop.entity.User;
import ru.develop.repo.UserRepo;

import java.util.List;

@Service
public class UserService {
    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public List<User> findAll(){
        return userRepo.findAll();
    }
}
