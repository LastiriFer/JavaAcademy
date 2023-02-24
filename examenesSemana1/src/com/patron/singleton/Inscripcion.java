package com.patron.singleton;

public class Inscripcion {

	// parte de la solución singleton es tener un atributo del tipo de clase PRIVADO
	private static Inscripcion ins;

	private String nombre_ins;
	private static int contador_inscripciones;

	// otra regla de este patrón es tener un contructor privado
	private Inscripcion(String nombre_ins) {
		this.nombre_ins = nombre_ins;
		contador_inscripciones++;
	}

	// debemos tener un método public que nos regrese un objeto del tipo Inscripcion
	public static Inscripcion getInscripcion() {
		// verificar si todavía no hay una inscripción para entonces iniciarla
		if (ins == null) {
			/*
			 * Como el contructor es privado solo podemos acceder a el desde esta clase por
			 * tanto debemos inicializarlo aquí
			 */
			ins = new Inscripcion("Clase de Finanzas");

		}

		return ins;
	}

	public static int getContador_inscripciones() {
		return contador_inscripciones;
	}

}
