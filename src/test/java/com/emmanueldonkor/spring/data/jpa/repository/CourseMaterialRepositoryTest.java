package com.emmanueldonkor.spring.data.jpa.repository;

import com.emmanueldonkor.spring.data.jpa.entity.Course;
import com.emmanueldonkor.spring.data.jpa.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMaterialRepositoryTest {

   @Autowired
   private  CourseMaterialRepository courseMaterialRepository;

   @Test
   public void SaveCourseMaterial() {
     Course course = Course.builder()
       .title("DSA")
       .credit(6)
       .build();
     CourseMaterial  courseMaterial = CourseMaterial.builder()
       .url("www.emmanueldonkor.com")
       .course(course)
       .build();
     courseMaterialRepository.save(courseMaterial);

   }

}
