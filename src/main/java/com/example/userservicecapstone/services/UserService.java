package com.example.userservicecapstone.services;

import com.example.userservicecapstone.models.Token;
import com.example.userservicecapstone.models.User;

public interface UserService {
    User signup(String name, String email, String password);
    Token login(String email, String password);
    void logout(String tokenValue);
    User validateToken(String tokenValue);
}
