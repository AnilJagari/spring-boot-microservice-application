package com.anil.school.feign;

import com.anil.school.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "STUDENT-SERVICE")
public interface StudentFeign {

    @GetMapping("/api/students")
     List<StudentDTO> getAllStudents();

    @PostMapping("/api/students")
    StudentDTO createStudentById(StudentDTO studdto);
    @GetMapping("/api/students/{id}")
    StudentDTO getStudentById(Long id);

}
