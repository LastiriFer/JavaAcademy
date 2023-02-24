package com.examen.interfaces;

public class HombreLobo implements CriaturaSobrenatural {
	String nombre;
	int edad;
	int fuerza;

	// Constructor de la clase Hombre Lobo
	public HombreLobo(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;

	}

	// sobreescritura de los métodos que se heredan de la clase padre:

	@Override
	public void getPoder() {
		System.out.println("Yo puedo correr muy rapido y soy muy fuerte");
	}

	@Override
	public void getDebilidad() {
		System.out.println("Mi debilidad es la plata");
	}

	@Override
	public void getDieta() {
		System.out.println("Yo como carne");
	}

	@Override
	public void alimentar() {
		this.fuerza+=1000;
		System.out.println("ESTOY aumentando mi fuerza con comida --- Fuerza: " + fuerza );
	}

	public String toString() {

		return "Hola yo soy "+ this.getClass().getSimpleName() + " Me llamo "+ nombre + " tengo " + edad+ " años ";
	}

	public String getNombre() {
		return nombre;
	}

	
}
