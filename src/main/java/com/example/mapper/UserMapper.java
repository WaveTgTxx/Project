package com.example.mapper;

import com.example.dto.request.user.LoginRequest;
import com.example.dto.request.user.RegistrationRequest;
import com.example.dto.request.user.UserDto;
import com.example.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User fromDto(LoginRequest dto);
    User fromDto(RegistrationRequest dto);
    UserDto toDto(User entity);
}