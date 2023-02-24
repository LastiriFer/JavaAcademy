package com.examen.clase.abstracta;

public abstract class CriaturaSobrenatural {
	
	String nombre;
	int edad;
	int fuerza;
	
	public CriaturaSobrenatural(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//Declaración de métodos abstractos
	abstract void getPoder();
	
	abstract void getDebilidad();
	
	abstract void getDieta();
	
	abstract void  alimentar();
	
	//métodos con funcionamiento
	public String toString() {
		
		return "Hola yo soy "+ this.getClass().getSimpleName();
	}
	
	 public int getFuerza() {
		return fuerza;
	}


	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	
	
	
	
	
	

}
