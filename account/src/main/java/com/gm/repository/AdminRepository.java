package com.gm.repository;

import com.gm.entity.Admin;

public interface AdminRepository {
    public Admin login(String username, String password);
}
