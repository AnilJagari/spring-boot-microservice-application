package com.anil.school.controller;

import com.anil.school.dto.StudentDTO;
import com.anil.school.dto.TeacherDTO;
import com.anil.school.feign.TeacherFeign;
import com.anil.school.service.ServiceSchool;
import com.anil.school.entity.School;
import com.anil.school.service.ServiceSchool;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schools")
@RequiredArgsConstructor
public class SchoolController {
    private final ServiceSchool service;
    @GetMapping
    public List<School> getAllSchools(){

        return service.getAllSchools();
    }

    @GetMapping("/{id}")
    public School getSchoolById(@PathVariable Long id){
        return service.getSchoolById(id);
    }

    @PostMapping
    public School createSchool(@RequestBody School teach){
        return service.createSchool(teach);
    }
    @PutMapping("/{id}")
    public School updateSchool(@PathVariable Long id,@RequestBody School teach){
        return service.updateSchoolById(id,teach);
    }
    @DeleteMapping("/{id}")
    public String deleteSchoolById(@PathVariable Long id){
        service.deleteSchoolById(id);
        return "School deleted Successfully";

    }
    @GetMapping("/teachers")
    public List<TeacherDTO> fetchAllTeachers(){

        return service.getAllTeachers();
    }
    @GetMapping("/students")
    public List<StudentDTO> FetchAllStudents(){
        return service.getAllStudents();
    }
    @PostMapping("/students")
    public StudentDTO createStudentById(@RequestBody StudentDTO studdto){
        return service.createStudentById(studdto);
    }
    @GetMapping("/students/{id}")
    public StudentDTO getStudentById(@PathVariable Long id){
        return service.getStudentById(id);
    }

}
