package com.example.backend.service;

import com.example.backend.db.CourseDB;
import com.example.backend.exception.NotFoundException;
import com.example.backend.model.CartItem;
import com.example.backend.model.Course;
import com.example.backend.model.dto.CartItemDto;
import com.example.backend.model.mapper.CartItemMapper;
import com.example.backend.repository.CartItemRepository;
import com.example.backend.repository.CategoryRepository;
import com.example.backend.repository.CourseRepository;
import com.example.backend.repository.UserRepository;
import com.example.backend.request.UpdateCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class CartService {
    @Autowired
    private CartItemRepository cartItemRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private UserRepository userRepository;

    public ArrayList<CartItemDto> finAllCartItem() {
        ArrayList<CartItemDto> result = new ArrayList<>();
        for (int i = 0; i < cartItemRepository.findAllUsers().size(); i++) {
            result.add(CartItemMapper.toCartItemDto(cartItemRepository.findAllUsers().get(i)));
        }
        return result;
    }
    public CartItem deleteItem(Integer id) {
        CartItem cartItem = cartItemRepository.findById(id).orElseThrow(() -> {
            throw new NotFoundException("Not found user with id = " + id);
        });
        cartItemRepository.findAllUsers().removeIf(item -> Objects.equals(item.getId(), id));
        return null;
    }

    public void incrementItem(Integer id, UpdateCount request) {

        CartItem cartItem = cartItemRepository.findById(id).orElseThrow(() -> {
            throw new NotFoundException("Not found cart with id = " + id);
        });

        cartItem.setCount(request.getCount());
    }
    public void decrementItem(Integer id, UpdateCount request) {
        CartItem cartItem = cartItemRepository.findById(id).orElseThrow(() -> {
            throw new NotFoundException("Not found cart with id = " + id);
        });
        if (request.getCount() < 1) {
            throw new NotFoundException(" Số lượng trả về không được nhỏ hơn 1 ");
        }
            cartItem.setCount(request.getCount());
        }
}
