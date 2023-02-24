package com.examen.interfaces;

public class Vampiro implements CriaturaSobrenatural {
	String nombre;
	int edad;
	int fuerza;

	// Constructor de la clase Vampiro
	public Vampiro(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	// sobreescritura de los métodos que se heredan de la clase padre:

	@Override
	public void getPoder() {
		System.out.println("Yo puedo leer mentes, correr muy veloz y soy muy fuerte");
	}

	@Override
	public void getDebilidad() {
		System.out.println("Mi debilidad es la luz del sol");
	}

	@Override
	public void getDieta() {
		System.out.println("Yo como sangre");
	}

	@Override
	public void alimentar() {
		this.fuerza+=2000;
		System.out.println("ESTOY aumentando mi fuerza con comida --- Fuerza: " + fuerza );
	}

	public String toString() {

		return "Hola yo soy "+ this.getClass().getSimpleName() + " Me llamo "+ nombre + " tengo " + edad+ " años ";
	}

	

}
