package com.example.dto.request.user;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class RegisterRequest {
    @NotNull(message = "Name cannot be Null")
    private String name;
    @Email
    @NotNull(message = "Email cannot be null")
    private String email;
    @NotNull(message = "Password cannot be null")
    @Size(min = 6, max = 15, message = "Create password with size between 6 and 15")
    private String password;
}
