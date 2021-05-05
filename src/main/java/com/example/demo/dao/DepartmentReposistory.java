package com.example.demo.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.DepartmentEntity;



@Repository
public interface DepartmentReposistory extends JpaRepository<DepartmentEntity, Long> {
}