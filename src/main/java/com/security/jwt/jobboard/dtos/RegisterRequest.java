package com.security.jwt.jobboard.dtos;

import com.security.jwt.jobboard.models.user.UserRole;

public record RegisterRequest(String login, String password, UserRole role) {

}
