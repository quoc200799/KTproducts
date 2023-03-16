package com.example.backend.model.dto;

import com.example.backend.model.Course;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class CartItemDto {
    private Integer id;
    private Course course;
    private Integer count;
}
