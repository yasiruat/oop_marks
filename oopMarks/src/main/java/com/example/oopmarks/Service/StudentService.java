package com.example.oopmarks.Service;

import com.example.oopmarks.Entity.Student;


import java.util.List;


public interface StudentService {
    List<Student> getAllStudent();
    void save(Student student);


}
