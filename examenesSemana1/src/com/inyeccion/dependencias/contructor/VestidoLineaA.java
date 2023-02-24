package com.inyeccion.dependencias.contructor;

public class VestidoLineaA extends Vestido {

	String talla;

	// VestidoHalter recibe String que indica la talla
	public VestidoLineaA(String talla) {
		this.talla = talla;
	}

	// Método usar no devuelve nada, imprime un String más la talla del vestido
	@Override
	public void usar() {

		System.out.println("Usar vestido línea A talla:  " + talla);
	}

}
