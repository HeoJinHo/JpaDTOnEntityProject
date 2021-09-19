package com.example.jpaentityproject.controllers;

import com.example.jpaentityproject.services.UserService;
import com.example.jpaentityproject.task.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @PostMapping("/insert")
    public UserDTO insertUser(@RequestBody UserDTO userDTO){
        return userService.userSetInsert(userDTO);
    }

}
