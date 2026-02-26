package com.anil.teacher.controller;

import com.anil.teacher.dto.StudentDTO;
import com.anil.teacher.entity.Teacher;
import com.anil.teacher.service.ServiceTeacher;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teachers")
@RequiredArgsConstructor
public class TeacherController {
    private final ServiceTeacher service;
    @GetMapping
    public List<Teacher> getAllTeachers(){
        return service.getAllTeachers();
    }

    @GetMapping("/{id}")
    public Teacher getTeacherById(@PathVariable Long id){
        return service.getTeacherById(id);
    }

    @PostMapping
    public Teacher createTeacher(@RequestBody Teacher teach){
        return service.createTeacher(teach);
    }
    @PutMapping("/{id}")
    public Teacher updateTeacher(@PathVariable Long id,@RequestBody Teacher teach){
        return service.updateTeacherById(id,teach);
    }
    @DeleteMapping("/{id}")
    public String deleteTeacherById(@PathVariable Long id){
        service.deleteTeacherById(id);
        return "Teacher deleted Successfully";
    }
    @GetMapping("/students")
    public List<StudentDTO> fetchStudentsFromStudentService(){
        return service.getAllStudentsFromStudentService();
    }

}
