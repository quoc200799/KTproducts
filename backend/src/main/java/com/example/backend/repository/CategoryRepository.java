package com.example.backend.repository;

import com.example.backend.db.CategoryDB;
import com.example.backend.db.CourseDB;
import com.example.backend.model.Category;
import com.example.backend.model.Course;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryRepository {
    public List<Category> findAllCategory(){
        return CategoryDB.categories;
    }
}
