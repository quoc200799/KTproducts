package com.example.backend.db;

import com.example.backend.model.CartItem;

import java.util.ArrayList;
import java.util.List;

public class CartDB {
    public static List<CartItem> cart = new ArrayList<>(List.of(
            new CartItem(1231,111,12),
            new CartItem(1232,123,4),
            new CartItem(1233,345,11),
            new CartItem(1234,234,3)
    ));
}
