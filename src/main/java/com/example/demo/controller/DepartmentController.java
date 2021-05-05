package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.employeeservice.DepartmentImpl;
import com.example.demo.entites.DepartmentEntity;
@RestController
public class DepartmentController {
	
	private static final long serialVersionUID = 1L;
	@Autowired
	private DepartmentImpl departmentService;

	@GetMapping("/dpt")

	public List<DepartmentEntity> getAllDepartment() {
		return this.departmentService.getAllDepartment();
	}

	@PostMapping("/dpt")
	public DepartmentEntity addDepartment(@RequestBody DepartmentEntity dept) {
		return this.departmentService.addDepartment(dept);
		
		}

}
