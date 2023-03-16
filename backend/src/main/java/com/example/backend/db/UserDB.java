package com.example.backend.db;

import com.example.backend.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDB {
    public static List<User> users = new ArrayList<>(List.of(
            new User(100,"Hanh","hanh@gmail.com","0914203422","avatar1"),
            new User(101,"Nam","nam@gmail.com","0914203422","avatar2"),
            new User(102,"Dũng","dung@gmail.com","0914203422","avatar3"),
            new User(103,"Hien","hien@gmail.com","0914203422","avatar4")
    ));
}
