package com.company.account.service;

import com.company.account.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}