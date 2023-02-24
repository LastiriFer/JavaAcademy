package com.inyeccion.dependencias.contructor;

public class VestidoPrincesa extends Vestido {

	String talla;

	// VestidoHalter recibe String que indica la talla
	public VestidoPrincesa(String talla) {
		this.talla = talla;
	}

	// Método usar no devuelve nada, imprime un String más la talla del vestido
	@Override
	public void usar() {

		System.out.println("Usar vestido corte princesa talla:  " + talla);
	}

}
