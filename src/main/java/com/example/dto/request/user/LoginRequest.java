package com.example.dto.request.user;

import lombok.Data;

@Data
public class LoginRequest {
    private String Name;
    private String email;
    private String password;
}
