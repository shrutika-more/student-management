package com.example.demo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;



import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;


@RestController  //he spring la sangte ha class rest api handle krnar ahe mhnje postman madhun request ali ki yogy method execute hoyil
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }
//GET API
    @GetMapping("/students")  //hi request ali ki..
    public List<Student> getAllStudents() {  //hi method execute hoyil
        return service.getAllStudents();
    }


    //get student by ID
    @GetMapping("/students/{id}")  //{id} mhnje URL madhun apn ID ghenar
public Student getStudentById(@PathVariable int id) {  //@PathVariable int id - ha URL madhla id java madhlya id variable madhe store krto
    return service.getStudentById(id);  //controller service la id deto
}


    //POST API   //ithe json madhun data adhi send krava lagto
    @PostMapping("/students")
public Student addStudent(@RequestBody Student student) {
    return service.addStudent(student);
}

//PUT API
@PutMapping("/students/{id}")
public Student updateStudent(
        @PathVariable int id,
        @RequestBody Student student) {

    return service.updateStudent(id, student);
}


//DELETE API
@DeleteMapping("/students/{id}")
public String deleteStudent(@PathVariable int id) {

    service.deleteStudent(id);

    return "Student deleted successfully";
}
}