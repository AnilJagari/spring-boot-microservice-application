package com.anil.teacher.service;

import com.anil.teacher.dto.StudentDTO;
import com.anil.teacher.entity.Teacher;
import com.anil.teacher.repository.RepositoryTeacher;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.Arrays.asList;

@Service
@RequiredArgsConstructor
public class ServiceTeacher {
    private final RepositoryTeacher repo;
    private final RestTemplate restTemplate;
    public List<Teacher> getAllTeachers(){
        return repo.findAll();
    }

    public Teacher getTeacherById(Long id){
        return repo.findById(id)
                .orElseThrow(() ->
                        new ResponseStatusException(
                                HttpStatus.NOT_FOUND,
                                "Student with ID " + id + " does not exist"
                        )
                );
    }

    public Teacher createTeacher(Teacher teach){
        return repo.save(teach);
   }

   public Teacher updateTeacherById(Long id, Teacher teach){
        Teacher existTeach=getTeacherById(id);
        existTeach.setEmail(teach.getEmail());
        existTeach.setName(teach.getName());
        existTeach.setSubject(teach.getSubject());
        return repo.save(existTeach);
   }

   public void deleteTeacherById(Long id){
        repo.deleteById(id);
   }

 public List<StudentDTO> getAllStudentsFromStudentService(){
     String url = "http://student-service/api/students";

     StudentDTO[] students=restTemplate.getForObject(url, StudentDTO[].class);
        return Arrays.asList(students);

 }

}
