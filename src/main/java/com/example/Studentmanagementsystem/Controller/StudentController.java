package com.example.Studentmanagementsystem.Controller;

import com.example.Studentmanagementsystem.Model.Student;
import com.example.Studentmanagementsystem.Service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    private StudentService studentService;
    public StudentController(StudentService studentService)
    {
        super();
        this.studentService=studentService;
    }

    @GetMapping("/students")
    public String listStudents(Model model)
    {
        model.addAttribute("students",studentService.getAllStudents());
        return "students";
    }

    @GetMapping("/students/new")
    public String createStudents(Model model){
        Student student = new Student();
        model.addAttribute("student",student );
        return "create_student";
    }
}
