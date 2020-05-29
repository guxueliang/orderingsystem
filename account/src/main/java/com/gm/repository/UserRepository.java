package com.gm.repository;

import com.gm.entity.User;

public interface UserRepository {
    public User login(String username, String password);
}
