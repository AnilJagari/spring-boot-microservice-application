package com.anil.studentapp.service;

import com.anil.studentapp.entity.Student;
import com.anil.studentapp.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository repo;
        public List<Student> getAllStudents(){
        return repo.findAll();
    }

    public Student saveStudent(Student stud){
            return repo.save(stud);
    }

    public Student getStudentById(Long id){
        return repo.findById(id)
                .orElseThrow(() ->
                        new ResponseStatusException(
                                HttpStatus.NOT_FOUND,
                                "Student with ID " + id + " does not exist"
                        )
                );
    }

    public Student updateStudent(Long id, Student stud){
            Student existStud=getStudentById(id);
            existStud.setName(stud.getName());
            existStud.setEmail(stud.getEmail());
            existStud.setCourse(stud.getCourse());
            return repo.save(existStud);

    }
    public void deleteStudentById(Long id){
            repo.deleteById(id);
    }

}
