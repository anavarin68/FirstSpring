package com.example.FirstSpring.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FirstSpring.Model.StudentDetails;
import com.example.FirstSpring.Repository.StudentRepository;
import com.example.FirstSpring.Service.StudentService;

@Service
public class StudentServiceImplementation implements StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	@Override
	public void saveStudent(StudentDetails studentDetails) {
		studentRepository.save(studentDetails);
		
	}
	
	

}
