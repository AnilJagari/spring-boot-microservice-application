package com.anil.school.repository;

import com.anil.school.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorySchool extends JpaRepository<School, Long> {
}
