package com.Student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Student.entity.Student;
@Repository
public interface StudentRepository  extends JpaRepository<Student, Long>{

}
