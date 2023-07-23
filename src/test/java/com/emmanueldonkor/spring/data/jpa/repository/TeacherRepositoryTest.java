package com.emmanueldonkor.spring.data.jpa.repository;

import com.emmanueldonkor.spring.data.jpa.entity.Course;
import com.emmanueldonkor.spring.data.jpa.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {
  @Autowired
  private TeacherRepository teacherRepo;


   @Test
   public void saveTeacher(){
    Course course = Course.builder()
      .title("DSa")
      .credit(6)
      .build();
     Course course1 = Course.builder()
       .title("Maths")
       .credit(4)
       .build();
    Teacher teacher = Teacher.builder()
      .firstName("Emmanuel")
      .lastName("Donkor")
      //.courses(List.of(course, course1))
      .build();
     teacherRepo.save(teacher);
   }
}
