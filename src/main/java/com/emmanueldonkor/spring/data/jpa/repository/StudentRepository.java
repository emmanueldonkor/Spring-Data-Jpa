package com.emmanueldonkor.spring.data.jpa.repository;

import com.emmanueldonkor.spring.data.jpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository  extends JpaRepository<Student, Long> {

}
