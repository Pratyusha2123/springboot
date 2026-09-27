package com.servlet.mapping_demo.repository;

import com.servlet.mapping_demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
