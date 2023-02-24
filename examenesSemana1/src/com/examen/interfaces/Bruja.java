package com.examen.interfaces;

public class Bruja implements  CriaturaSobrenatural{
	String nombre;
	int edad;
	int fuerza;
	//Constructor de la clase bruja
	public Bruja(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//sobreescritura de los métodos que se heredan de la clase padre:
	
	@Override
	public void getPoder() {
		System.out.println("Yo puedo hacer muchos hechizos");
	}

	@Override
	public void getDebilidad() {
		System.out.println("Mi debilidad es la naturaleza");
	}

	@Override
	public void getDieta() {
		System.out.println("Yo como comida normal");
	}
	
	@Override
	public void alimentar() {
		
		this.fuerza+=50;
		System.out.println("ESTOY aumentando mi fuerza con comida --- Fuerza: " + fuerza );
		
		 
	}
	
	public String toString() {
		
		return "Hola yo soy "+ this.getClass().getSimpleName() + " Me llamo "+ nombre + " tengo " + edad+ " años ";
	}

	
	
	
	
	

	

}
