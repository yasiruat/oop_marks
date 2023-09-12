package com.example.oopmarks.Controller;

import com.example.oopmarks.Entity.Student;
import com.example.oopmarks.Service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    @Autowired
   private StudentServiceImpl studentServiceImpl;
    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("student",new Student());
        return "home";
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute("student") Student student){
        studentServiceImpl.save(student);
        return "redirect:/";
    }
    @GetMapping("/view")
    public String viewMarks(Model model){
        model.addAttribute("studentList",studentServiceImpl.getAllStudent());
        return "markList";
    }
}
