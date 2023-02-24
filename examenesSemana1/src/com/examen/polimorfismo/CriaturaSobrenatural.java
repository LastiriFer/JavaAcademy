package com.examen.polimorfismo;

public class CriaturaSobrenatural {
	
	String nombre;
	int edad;
	int fuerza;
	//constructor de criatura
	public CriaturaSobrenatural(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//Declaración de métodos 
	void getPoder() {
		System.out.println("Yo no tengo ningun poder");
	}
	
	void getDebilidad() {
		System.out.println("Yo no tengo debilidades");
	}
	
	void getDieta() {
		System.out.println("Yo puedo comer de todo");
	}
	public void  alimentar() {	}
	
	//Obtenemos el nomre de la clase
	public String toString() {
		
		return "Hola yo soy "+ this.getClass().getSimpleName();
	}
	
	
	public int getFuerza() {
		return fuerza;
	}


	
	
	
	
	
	

}
