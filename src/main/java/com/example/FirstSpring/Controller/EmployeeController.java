package com.example.FirstSpring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FirstSpring.Model.EmployeeDetails;
import com.example.FirstSpring.Service.EmployeeService;


@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/save")
	public String saveEmployee(@RequestBody EmployeeDetails employeeDetails) {
		employeeService.saveEmployee(employeeDetails);
		return "Data Saved Successfully";
	}
	
	@GetMapping("/getall")
	public List<EmployeeDetails> getallEmployee(){
		return employeeService.getallEmployee();
		
	}

}
