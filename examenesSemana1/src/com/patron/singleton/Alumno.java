package com.patron.singleton;

/*El objetivo de singleton es no crear tantos objetos para realizar una tarea, en este caso una Inscripcion sino utilizar un solo 
 * objeto para esto*/
public class Alumno {

	String nombre;
	Inscripcion ins;

	// Contructor de la clase Alumno
	public Alumno(String nombre) {
		this.nombre = nombre;

	}

	public static void main(String[] args) {
		// creamos un objeto de tipo Alumno
		Alumno alumno1 = new Alumno("Fer");
		alumno1.ins = Inscripcion.getInscripcion(); // Invocamos el método STATIC getInscripcion de la clase Inscripción

		// creamos un objeto de tipo Alumno para crear una segunda inscripción
		Alumno alumno2 = new Alumno("Diana");
		alumno2.ins = Inscripcion.getInscripcion();

		// Sección de impresion de los alumnos con sus inscripciones
		System.out.println(alumno1.nombre);
		System.out.println(alumno1.ins);
		System.out.println();

		System.out.println(alumno2.nombre);
		System.out.println(alumno2.ins);

		System.out.println(); // NOTAR que solo se genera una inscripcion al curso aunque se sigan creando más
								// alumnos
		System.out.println("Inscripcones: " + Inscripcion.getContador_inscripciones());
	}

}
