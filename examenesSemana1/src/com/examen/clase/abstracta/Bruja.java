package com.examen.clase.abstracta;

public class Bruja extends CriaturaSobrenatural{
	
	//Constructor de la clase bruja
	public Bruja(String nombre, int edad) {
		super(nombre, edad);
	}
	
	//sobreescritura de los métodos que se heredan de la clase padre:
	
	@Override
	void getPoder() {
		System.out.println("Yo puedo hacer muchos hechizos");
	}

	@Override
	void getDebilidad() {
		System.out.println("Mi debilidad es la naturaleza");
	}

	@Override
	void getDieta() {
		System.out.println("Yo como comida normal");
	}
	
	@Override
	public void alimentar() {
		System.out.println("ESTOY aumentando mi fuerza con comida");
		
		this.fuerza+=50;
	}

}
