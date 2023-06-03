package com.example.mapper;

import com.example.dto.request.user.LoginRequest;
import com.example.dto.request.user.RegisterRequest;
import com.example.dto.response.user.UserResponse;
import com.example.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User fromDto(LoginRequest dto);
    User fromDto(RegisterRequest dto);
    UserResponse toDto(User entity);
}