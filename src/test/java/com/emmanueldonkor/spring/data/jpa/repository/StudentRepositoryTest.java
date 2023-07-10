package com.emmanueldonkor.spring.data.jpa.repository;

import com.emmanueldonkor.spring.data.jpa.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {
  @Autowired
  private StudentRepository studentRepository;

  @Test
  public void saveStudent(){
    Student student = Student.builder()
      .emailId("emmanuelmk42@gmail.com")
      .firstName("Emmanuel")
      .lastName("Donkor")
      .guardianName("David")
      .guardianEmail("davidonkor42@gmail.com")
      .guardianMobile("96947577374")
      .build();
    studentRepository.save(student);
  }
  @Test
  public void printAllStudent(){
    List<Student> studentList = studentRepository.findAll();
    System.out.println("studentList =" + studentList);
  }


}
