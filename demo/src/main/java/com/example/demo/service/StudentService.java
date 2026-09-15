package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) { //dependency injection
        this.repository = repository;
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }


    //POST API
    public Student addStudent(Student student) { //controller madhun alela student object ha student variable madhe jato
    return repository.save(student);  //repository chya save method la to stduent object deto ani mg studebtdbb madhe record save hoto
}

//get student by id
public Student getStudentById(int id) {
    return repository.findById(id)  //repository madhun hya id cha stduent ahe ka bgnar  ani response yenar 
            .orElseThrow(() -> new RuntimeException("Student not found"));
}

//PUT API
public Student updateStudent(int id, Student student) {

    Student existingStudent = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Student not found"));

    existingStudent.setName(student.getName());
    existingStudent.setAge(student.getAge());
    existingStudent.setCity(student.getCity());

    return repository.save(existingStudent);
}

//DELETE API 
public void deleteStudent(int id) {

    repository.deleteById(id);
}
}