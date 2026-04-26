// LoginRequest.java
package com.epw.user.dto;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;
    private String password;
}