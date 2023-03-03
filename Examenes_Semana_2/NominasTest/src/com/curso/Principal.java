package com.curso;

public class Principal {

	public static void main(String[] args) {
		// Se crean los objetos de empleado del tipo laboratorista y programador
		Empleado emp1 = new Laboratorista(230, 48, 500);
		Empleado emp2 = new Programador(150, 48);

		// llamamos los métodos calcular sueldo para cada empleado
		double sueldoe1 = emp1.calculaSueldo();
		double sueldoe2 = emp2.calculaSueldo();
		System.out.println(sueldoe1);
		System.out.println(sueldoe2);
	}

}
