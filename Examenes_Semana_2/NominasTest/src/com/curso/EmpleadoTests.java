package com.curso;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class EmpleadoTests {

	// Test para verificar el cálculo del sueldo del empleado con bono
	@Test
	void calcularsueldoConBono() {
		Empleado emp1 = new Laboratorista(230, 48, 500);
		double sueldoBase = 230;
		double bono = 500;
		int horasTrabajo = 48;

		double sueldoEsperado = (sueldoBase * horasTrabajo) + bono;
		System.out.println(emp1);
		double sueldoCalculado = emp1.calculaSueldo();

		assertEquals(sueldoCalculado, sueldoEsperado, 0.09);
		assertNotNull(sueldoCalculado);

	}

	// Test para verificar el cálculo del sueldo del empleado sin bono también
	// verifica que la función no regrese un null
	@Test
	void calcularsueldoSinBono() {
		Empleado emp = new Programador(230, 48);
		double sueldoBase = 230;
		int horasTrabajo = 48;

		double sueldoEsperado = (sueldoBase * horasTrabajo);
		System.out.println(emp);
		double sueldoCalculado = emp.calculaSueldo();

		assertEquals(sueldoCalculado, sueldoEsperado, 0.09);
		assertNotNull(sueldoCalculado);

	}

	// Test para verificar que la función calcular sueldo no devuelva un null (se
	// manda bono)
	@Test
	@DisplayName("verify calculaSueldo returns ")
	void calcularsueldoConBonoNoNull() {
		Empleado emp1 = new Laboratorista(230, 48, 500);

		double sueldoCalculado = emp1.calculaSueldo();

		assertNotNull(sueldoCalculado);

	}

	// Test para verificar que la función calcular sueldo no devuelva un null (sin
	// bono)
	@Test
	void calcularsueldoSinBonoNoNull() {
		Empleado emp = new Programador(230, 48);

		double sueldoCalculado = emp.calculaSueldo();

		assertNotNull(sueldoCalculado);

	}

	// Test para verificar que el Objeto empleado no sea Null
	@Test
	@DisplayName("When the object Empleado is NULL")
	void empleadoNull() {
		Empleado emp = null;

		assertThrows(NullPointerException.class, () -> emp.toString().length());
	}

	// Test para verificar que las horas trabajadas sean mayores a una
	@Test
	void horasTrabajadasTrue() {
		Empleado emp = new Laboratorista(230, 48, 500);

		int dias = emp.getHorasTrabajo();

		assertTrue(dias > 1);

	}

	// Test para verificar que las horas trabajadas no sean menores a una
	@Test
	void horasTrabajadas() {
		Empleado emp = new Laboratorista(230, 48, 500);

		int dias = emp.getHorasTrabajo();

		assertFalse(dias < 1);

	}

}
