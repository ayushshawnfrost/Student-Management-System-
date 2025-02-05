package com.synchrony.demo.controller;


import com.synchrony.demo.model.Student;
import com.synchrony.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/search")
    public List<Student> searchStudentByName(@RequestParam String name) {
        return studentRepository.findByNameContainingIgnoreCase(name);
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student updatedStudent) {
        return studentRepository.findById(id)
                .map(student -> {
                    student.setName(updatedStudent.getName());
                    student.setAge(updatedStudent.getAge());
                    student.setClassName(updatedStudent.getClassName());
                    student.setPhoneNumber(updatedStudent.getPhoneNumber());
                    return studentRepository.save(student);
                })
                .orElseThrow(() -> new RuntimeException("Student not found with id " + id));
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentRepository.deleteById(id);
    }
}
