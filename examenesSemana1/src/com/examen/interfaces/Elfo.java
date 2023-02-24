package com.examen.interfaces;

public class Elfo implements CriaturaSobrenatural {
	String nombre;
	int edad;
	int fuerza;

	// Constructor de la clase Elfo
	public Elfo(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	// sobreescritura de los métodos que se heredan de la clase padre:

	@Override
	public void getPoder() {
		System.out.println("Yo tengo magia y puedo controlar mentes");
	}

	@Override
	public void getDebilidad() {
		System.out.println("Mi debilidad es el agua");
	}

	@Override
	public void getDieta() {
		System.out.println("Yo como dulces");
	}

	@Override
	public void alimentar() {
		this.fuerza+=10;
		System.out.println("ESTOY aumentando mi fuerza con comida --- Fuerza: " + fuerza );
	}

	public String toString() {

		return "Hola yo soy "+ this.getClass().getSimpleName() + " Me llamo "+ nombre + " tengo " + edad+ " años ";
	}
	

	
}
