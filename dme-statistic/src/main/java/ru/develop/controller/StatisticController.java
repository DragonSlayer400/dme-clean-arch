package ru.develop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.develop.entity.User;
import ru.develop.service.UserService;

import java.util.List;

@RestController
public class StatisticController {

    private final UserService userService;

    public StatisticController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/statistic/all")
    public List<User> findAll(){
        return userService.findAll();
    }

}
