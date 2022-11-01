package com.example.Studentmanagementsystem.Service.Implementation;

import com.example.Studentmanagementsystem.Model.Student;
import com.example.Studentmanagementsystem.Repository.StudentRepository;
import com.example.Studentmanagementsystem.Service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
//no need to add autowired if the spring bean has only one constructor
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository)
    {
        super();
        this.studentRepository=studentRepository;
    }
    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
}
