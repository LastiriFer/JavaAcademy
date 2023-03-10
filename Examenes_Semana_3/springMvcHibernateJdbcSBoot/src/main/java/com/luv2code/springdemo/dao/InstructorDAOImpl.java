package com.luv2code.springdemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.luv2code.springdemo.entity.Instructor;

@Repository
public class InstructorDAOImpl implements InstructorDAO {

	// define field for entitymanager
		private EntityManager entityManager;

		// set up constructor injection
		@Autowired
		public void InstructorDAOHibernate(EntityManager theEntityManager) {
			entityManager = theEntityManager;
		}

			
	@Override
	public Instructor getInstructor(String instructorName) {
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// now retrieve/read from database using the primary key
		Instructor theInstructor  = (Instructor) currentSession.createQuery("from Instructor where nombre=:nom")
									.setParameter("nom", instructorName).uniqueResult();
		
		//System.out.println("INS"+ theInstructor.getDescripcion());
		
		return theInstructor;
	}

	
		
		

}











