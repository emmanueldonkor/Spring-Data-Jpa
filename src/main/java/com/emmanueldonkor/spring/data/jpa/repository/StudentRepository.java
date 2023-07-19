package com.emmanueldonkor.spring.data.jpa.repository;

import com.emmanueldonkor.spring.data.jpa.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository  extends JpaRepository<Student, Long> {
 public List<Student> findByFirstName(String firstName);

 //JPQL
  @Query("select s.firstName from Student s where s.emailId = ?1")
    String getStudentFirstNameByEmailAddress(String emailId);

  //Native
  @Query(
    value = "SELECT * FROM tbl_student s where s.email_address = ?1",
    nativeQuery = true
  )
  Student getStudentEmailAddressNative(String emailId);

  @Modifying
  @Transactional
  @Query(
    value ="updapate tbl_student set first_name =?1 where email_address = ?2",
    nativeQuery = true
  )
  int updateStudentNameByEmailId(String firstName, String emailId);
}
