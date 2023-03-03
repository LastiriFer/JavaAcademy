package com.curso;

public class Empleado {

	// El empleado tendra un sueldo base un bono y horas de trabajo, que ayudarán a
	// calcular el sueldo todal
	double sueldoBase;
	double bono;
	int horasTrabajo;

	// método que inicializa un empleado que si tiene bono
	public Empleado(double sueldoBase, int horasTrabajo, double bono) {

		this.sueldoBase = sueldoBase;
		this.horasTrabajo = horasTrabajo;
		this.bono = bono;
	}

	// método que inicializa un empleado que no tiene bono
	public Empleado(double sueldoBase, int horasTrabajo) {

		this.sueldoBase = sueldoBase;
		this.horasTrabajo = horasTrabajo;

	}

	// método que se implementa en las clases que heredan de empleado
	public double calculaSueldo() {
		return 0;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getHorasTrabajo() {
		return horasTrabajo;
	}

	public void setHorasTrabajo(int horasTrabajo) {
		this.horasTrabajo = horasTrabajo;
	}

	public double getBono() {
		return bono;
	}

	public void setBono(double bono) {
		this.bono = bono;
	}

	@Override
	public String toString() {
		return "Laboratorista [sueldoBase=" + sueldoBase + ", bono=" + bono + ", horasTrabajo=" + horasTrabajo + "]";
	}

}
