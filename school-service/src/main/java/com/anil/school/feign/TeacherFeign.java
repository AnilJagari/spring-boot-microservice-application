package com.anil.school.feign;

import com.anil.school.dto.TeacherDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@FeignClient(name = "TEACHER-SERVICE")  // MUST match Eureka service name
public interface TeacherFeign {

    @GetMapping("/api/teachers")  // endpoint in Teacher Service
    List<TeacherDTO> getAllTeachers();
}
