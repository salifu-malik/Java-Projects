package com.mankind.crudOperations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentRepository repo;
    // Get all students
    @GetMapping("/students")
    @ResponseStatus(HttpStatus.OK)
    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    //Get student by ID
    @GetMapping("/students/{id}")
    @ResponseStatus(code  = HttpStatus.OK)
    public Student getStudentById(@PathVariable int id) {

        return repo.findById(id).get();
    }

    //Add a student
    @PostMapping("/students/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createStudent(@RequestBody Student student) {
        repo.save(student);
    }

    //Update student details
    @PutMapping("/students/update/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Student updateStudentById(@PathVariable int id) {
        Student student = repo.findById(id).get();
        student.setName("Halima");
        student.setPercentage(74);
        repo.save(student);
        return student;

    }

    //Delete a student
    @DeleteMapping("/students/delete/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deleteStudentById(@PathVariable  int id) {
        repo.deleteById(id);
    }
}
