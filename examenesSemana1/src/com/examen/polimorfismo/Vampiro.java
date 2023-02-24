package com.examen.polimorfismo;

public class Vampiro extends CriaturaSobrenatural {
	
	//Constructor de la clase Vampiro
	public Vampiro(String nombre, int edad) {
		super(nombre, edad);
	}
	
	//sobreescritura de los métodos que se heredan de la clase padre:
	
	@Override
	void getPoder() {
		System.out.println("Yo puedo leer mentes, correr muy veloz y soy muy fuerte");
	}

	@Override
	void getDebilidad() {
		System.out.println("Mi debilidad es la luz del sol");
	}

	@Override
	void getDieta() {
		System.out.println("Yo como sangre");
	}
	
	@Override
	public void alimentar() {
		System.out.println("ESTOY aumentando mi fuerza con sangre");
		
		this.fuerza+=2000;
	}

}
