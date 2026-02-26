package com.anil.studentapp.controller;
import com.anil.studentapp.entity.Student;
import java.util.List;
import com.anil.studentapp.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.Parameter;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/students")
public class StudentController {
    public final StudentService serv;
    @GetMapping("/test")
    public String test() {
        return "Controller working";
    }

    @GetMapping
    public List<Student> getAllStudents(){

        return serv.getAllStudents();
    }

    @PostMapping
    public Student createStudent(@RequestBody Student stud){

        return serv.saveStudent(stud);
    }

    @GetMapping(value = "/{id}")
    public Student getStudentById(@PathVariable Long id){
        return serv.getStudentById(id);
    }
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id,@RequestBody Student stud ){
       return serv.updateStudent(id, stud);
    }
    @DeleteMapping("/{id}")
    public String deleteStudentByid(@PathVariable Long id){
        serv.deleteStudentById(id);
        return "Student Deleted Successfully";
    }
}
