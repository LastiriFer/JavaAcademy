package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.entity.Instructor;

@Repository
public class InstructorDAOImpl implements InstructorDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
			
	@Override
	public Instructor getInstructor(String instructorName) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// now retrieve/read from database using the primary key
		Instructor theInstructor  = (Instructor) currentSession.createQuery("from Instructor where nombre=:nom")
									.setParameter("nom", instructorName).uniqueResult();
		
		//System.out.println("INS"+ theInstructor.getDescripcion());
		
		return theInstructor;
	}

	
		
		

}











