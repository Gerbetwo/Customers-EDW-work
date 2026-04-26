// RegisterRequest.java
package com.epw.user.dto;

import lombok.Data;

@Data
public class RegisterRequest {
    private String username;
    private String password;
    private String role;   // opcional, por defecto "ROLE_1"
}