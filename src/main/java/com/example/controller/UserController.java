package com.example.controller;

import com.example.dto.request.user.UserDto;
import com.example.dto.response.user.UserResponse;
import com.example.entity.User;
import com.example.mapper.UserMapperImpl;
import com.example.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {
    private UserService userService;
    private UserMapperImpl userMapper;

    @GetMapping
    public List<UserResponse> users(){
        return userService.users().stream().map(userMapper::toDto).toList();
    }
}
