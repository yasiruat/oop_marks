package com.example.oopmarks.Service;

import com.example.oopmarks.Entity.Student;
import com.example.oopmarks.Repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {
    @Autowired private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }


    @Override public void save(Student student){
            studentRepository.save(student);
        }

    }



