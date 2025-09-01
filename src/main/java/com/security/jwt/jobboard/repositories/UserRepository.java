package com.security.jwt.jobboard.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.security.jwt.jobboard.models.user.UserModel;

public interface UserRepository extends JpaRepository<UserModel, String>{
    UserDetails findByLogin(String login);
}
