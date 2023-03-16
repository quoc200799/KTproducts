package com.example.backend.repository;

import com.example.backend.db.CartDB;
import com.example.backend.db.CourseDB;
import com.example.backend.model.CartItem;
import com.example.backend.model.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CartItemRepository {
    public List<CartItem> findAllUsers(){
        return CartDB.cart;
    }
    public Optional<CartItem> findById(Integer id) {
        return CartDB.cart
                .stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }
}
