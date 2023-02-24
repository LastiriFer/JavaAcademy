package com.examen.polimorfismo;

public class Elfo extends CriaturaSobrenatural{
	
	//Constructor de la clase Elfo
	public Elfo(String nombre, int edad) {
		super(nombre, edad);
	}
	
	
	//sobreescritura de los métodos que se heredan de la clase padre:
	@Override
	void getPoder() {
		System.out.println("Yo tengo magia y puedo controlar mentes");
	}

	@Override
	void getDebilidad() {
		System.out.println("Mi debilidad es el agua");
	}

	@Override
	void getDieta() {
		System.out.println("Yo como dulces");
	}
	
	
	@Override
	public void alimentar() {
		System.out.println("ESTOY aumentando mi fuerza con dulces");
		
		this.fuerza+=10;
	}

}
