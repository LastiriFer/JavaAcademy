package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.dao.InstructorDAO;
import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.entity.Instructor;

@Service
public class InstructorServiceImpl implements InstructorService {

	// need to inject customer dao
	@Autowired
	private InstructorDAO instructorDAO;
	
	@Override
	@Transactional
	public Instructor getInstructor(String instructorName) {
		
		return instructorDAO.getInstructor(instructorName);
	}

	
}





