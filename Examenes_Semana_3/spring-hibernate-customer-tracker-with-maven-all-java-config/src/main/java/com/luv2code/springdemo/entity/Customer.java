package com.luv2code.springdemo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nombre")
	private String firstName;
	
	@Column(name="apellido")
	private String lastName;
	
	@Column(name="correo")
	private String email;
	
	@Column(name="capacitaciones")
	private int capacitaciones;
	
	@Column(name="instructor")
	private String instructor;
	
	/*@ManyToOne(optional= false, cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	private CustomerInstructor  customer_instructor;*/
	
	public Customer() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
	public int getCapacitaciones() {
		return capacitaciones;
	}

	public void setCapacitaciones(int capacitaciones) {
		this.capacitaciones = capacitaciones;
	}
	
	
	

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", capacitaciones=" + capacitaciones + ", instructor=" + instructor + "]";
	}

	

	
		
}





