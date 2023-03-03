package com.curso;

public class Programador extends Empleado {

	// la clase Programador crea un objeto que extiende de empleado, ese obtjeto no
	// recibe un bono
	public Programador(double sueldoBase, int horasTrabajo) {
		super(sueldoBase, horasTrabajo);

	}

	// método que calcula el sueldo del empleado sin bono
	public double calculaSueldo() {

		double sueldoTotal = sueldoBase * horasTrabajo;

		return sueldoTotal;
	}

}
