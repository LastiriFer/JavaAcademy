package com.luv2code.web.jdbc;

import java.util.List;

public class Student {

	private int id;
	private String nombre;
	private String apellido;
	private String email;
	private String edad;
	private List<Course> courses;

	/*public Student(String nombre, String apellido, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}*/
	public Student(String nombre, String apellido, String email,String edad, List<Course> courses) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.edad= edad;
		this.courses= courses;
	}

	/*public Student(int id, String firstName, String lastName, String email) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}*/

	public Student(int id, String nombre, String apellido, String email,String edad,List<Course> courses) {
		this.id = id;
		this.nombre =  nombre;
		this.apellido = apellido;
		this.email = email;
		this.edad = edad;
		this.courses = courses;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	
	
	
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", courses=" + courses + "]";
	}

		
}
