package com.inyeccion.dependencias.setters;

public class InyectorVestido {

	// Inicializamos diferentes tipos de vestidos, enviando si talla
	static Vestido vs = new VestidoSirena("S");
	static Vestido va = new VestidoLineaA("M");
	static Vestido vh = new VestidoHalter("G");
	static Vestido vp = new VestidoPrincesa("XS");

	// Método que asigna a cada dama un vestido tomando en cuenta un color
	//Se hace la inyeccion por setters
	static DamaHonor getDama(String nombre, ColorVestido color) {
		DamaHonor dama = null;

		switch (color) {
		case NEGRO:
			dama= new DamaHonor();
			dama.setVestido(vs);

			return dama;

		case AZUL:
			dama= new DamaHonor();
			dama.setNombre(nombre);
			dama.setVestido(va);;

			return dama;
		case AMARILLO:
			dama= new DamaHonor();
			dama.setNombre(nombre);
			dama.setVestido(vh);

			return dama;

		case ROJO:
			dama= new DamaHonor();
			dama.setNombre(nombre);
			dama.setVestido(vp);

			return dama;
		case LAVANDA:
			dama= new DamaHonor();
			dama.setVestido(vs);
			dama.setNombre(nombre);
			return dama;

		default:
			dama= new DamaHonor();
			dama.setNombre(nombre);
			dama.setVestido(vs);

			return dama;
		}
	}

}
