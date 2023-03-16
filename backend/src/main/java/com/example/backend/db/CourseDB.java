package com.example.backend.db;

import com.example.backend.model.Course;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class CourseDB {

    public static List<Course> courses = new ArrayList<>(List.of(
            new Course(111,"Áo Sơ mi","","Áo",CategoryDB.categories,"https://bizweb.dktcdn.net/thumb/1024x1024/100/426/984/products/z2411209596037-cff07cb9281741d50cd51f4f63b49688.jpg?v=1651807313727",20_000,3.4,100),
            new Course(123,"Quần cọc","","Quần",CategoryDB.categories,"http://product.hstatic.net/200000195587/product/quan-dui-bo-doi_0546eacc165c4980a2f8e6298ec143b6_grande.jpg",25_000,4.4,101),
            new Course(345,"Quần bò","","Quần",CategoryDB.categories,"https://mayhopphat.com/wp-content/uploads/2022/04/Quan-bo-la-gi-683x1024.jpg",60_000,4.1,102),
            new Course(234,"Mũ lưỡi trai","","Mũ",CategoryDB.categories,"https://zerdio.com.vn/wp-content/uploads/2020/12/mu-luoi-trai-den-tron-9.jpg",45_000,2.4,103)
    ));
}
