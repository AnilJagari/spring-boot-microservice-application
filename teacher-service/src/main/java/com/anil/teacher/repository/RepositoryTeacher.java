package com.anil.teacher.repository;

import com.anil.teacher.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryTeacher extends JpaRepository<Teacher, Long> {
}
