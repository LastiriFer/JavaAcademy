package com.examen.polimorfismo;

public class HombreLobo extends CriaturaSobrenatural {
	
	//Constructor de la clase Hombre Lobo
	public HombreLobo(String nombre, int edad) {
		super(nombre,edad);
	}
	
	
	//sobreescritura de los métodos que se heredan de la clase padre:
	@Override
	void getPoder() {
		System.out.println("Yo puedo correr muy rapido y soy muy fuerte");
	}

	@Override
	void getDebilidad() {
		System.out.println("Mi debilidad es la plata");
	}

	@Override
	void getDieta() {
		System.out.println("Yo como carne");
	}
	
	@Override
	public void alimentar() {
		System.out.println("ESTOY aumentando mi fuerza con carne");
		
		this.fuerza+=1000;
	}

}
