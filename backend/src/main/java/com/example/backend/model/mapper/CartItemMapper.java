package com.example.backend.model.mapper;

import com.example.backend.db.CourseDB;
import com.example.backend.model.CartItem;
import com.example.backend.model.Course;
import com.example.backend.model.dto.CartItemDto;

import java.util.Objects;

public class CartItemMapper {
    public static CartItemDto toCartItemDto(CartItem cartItem) {
        Course course = new Course();
        for (int i = 0; i < CourseDB.courses.size(); i++) {
            if (Objects.equals(cartItem.getCourseId(), CourseDB.courses.get(i).getId())) {
                course = CourseDB.courses.get(i);
                break;
            }
        }
        CartItemDto tmp = new CartItemDto();
        tmp.setId(cartItem.getId());
        tmp.setCourse(course);
        tmp.setCount(cartItem.getCount());
        return tmp;
    }
}
