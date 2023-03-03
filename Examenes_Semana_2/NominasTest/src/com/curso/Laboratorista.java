package com.curso;

public class Laboratorista extends Empleado {

	// la clase laboratorista crea un objeto que extiende de empleado, ese obtjeto
	// si recibe un bono
	public Laboratorista(double sueldoBase, int horasTrabajo, double bono) {
		super(sueldoBase, horasTrabajo, bono);

	}

	// método que calcula el sueldo del empleado con bono
	public double calculaSueldo() {

		double sueldoTotal = (sueldoBase * horasTrabajo) + bono;
		return sueldoTotal;
	}

}
