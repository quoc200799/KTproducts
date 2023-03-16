package com.example.backend.repository;

import com.example.backend.db.CategoryDB;
import com.example.backend.db.UserDB;
import com.example.backend.model.Category;
import com.example.backend.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    public List<User> findAllUser(){
        return UserDB.users;
    }
}
