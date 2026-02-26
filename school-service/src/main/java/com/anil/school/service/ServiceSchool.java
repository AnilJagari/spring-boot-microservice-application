package com.anil.school.service;

import com.anil.school.dto.StudentDTO;
import com.anil.school.dto.TeacherDTO;
import com.anil.school.entity.School;
import com.anil.school.feign.StudentFeign;
import com.anil.school.feign.TeacherFeign;
import com.anil.school.repository.RepositorySchool;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceSchool {
    private final RepositorySchool repo;
    private final TeacherFeign teacherFeign;
    private final StudentFeign studentFeign;
    public List<School> getAllSchools(){
        return repo.findAll();
    }

    public School getSchoolById(Long id){
        return repo.findById(id)
                .orElseThrow(() ->
                        new ResponseStatusException(
                                HttpStatus.NOT_FOUND,
                                "Student with ID " + id + " does not exist"
                        )
                );
    }

    public School createSchool(School teach){
        return repo.save(teach);
   }

   public School updateSchoolById(Long id, School teach){
        School existTeach=getSchoolById(id);
        existTeach.setName(teach.getName());
        existTeach.setLocation(teach.getLocation());
        return repo.save(existTeach);
   }

   public void deleteSchoolById(Long id){
        repo.deleteById(id);
   }
   public List<TeacherDTO> getAllTeachers(){
        return teacherFeign.getAllTeachers();
   }
   public List<StudentDTO> getAllStudents(){
        return studentFeign.getAllStudents();
   }
    public StudentDTO createStudentById(StudentDTO studdto){
        return studentFeign.createStudentById(studdto);
    }
    public StudentDTO getStudentById( Long id){
        return studentFeign.getStudentById(id);
    }

}
