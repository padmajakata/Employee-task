package com.example.demo.employeeservice;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DepartmentReposistory;
import com.example.demo.entites.DepartmentEntity;


@Service
public class DepartmentImpl {
	@Autowired
	private DepartmentReposistory departmentRepository;

	public List<DepartmentEntity> getAllDepartment() {
		return departmentRepository.findAll();
	}

	public DepartmentEntity addDepartment(DepartmentEntity dept) {
		return departmentRepository.save(dept);
	}
}
