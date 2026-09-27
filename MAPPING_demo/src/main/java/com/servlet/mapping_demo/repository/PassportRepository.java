package com.servlet.mapping_demo.repository;

import com.servlet.mapping_demo.entity.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportRepository extends JpaRepository<Passport, Integer> {
}
