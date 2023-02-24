package com.inyeccion.dependencias.contructor;

public class DamaHonor {

	private String nombre;
	private Vestido vestido;

	// DamaHonor recibe un nombre y un vestido
	public DamaHonor(String nombre, Vestido vestido) {
		super();
		this.nombre = nombre;
		this.vestido = vestido;
	}

	// método usarVestido imprime el nombre y el vestido a usar
	void usarVestido() {
		System.out.println(nombre);

		vestido.usar();
	}

}
