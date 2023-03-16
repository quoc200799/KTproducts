package com.example.backend.repository;

import com.example.backend.db.CartDB;
import com.example.backend.db.CourseDB;
import com.example.backend.model.CartItem;
import com.example.backend.model.Course;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CourseRepository {
    public List<Course> findAllCourse(){
        return CourseDB.courses;
    }

}
