package com.inyeccion.dependencias.contructor;

public class InyectorVestido {

	// Inicializamos diferentes tipos de vestidos, enviando si talla
	static Vestido vs = new VestidoSirena("S");
	static Vestido va = new VestidoLineaA("M");
	static Vestido vh = new VestidoHalter("G");
	static Vestido vp = new VestidoPrincesa("XS");

	// Método que asigna a cada dama un vestido tomando en cuenta un color
	//la inyeccion se hace por constructor
	static DamaHonor getDama(String nombre, ColorVestido color) {
		DamaHonor dama = null;

		switch (color) {
		case NEGRO:
			dama = new DamaHonor(nombre, vs);

			return dama;

		case AZUL:
			dama = new DamaHonor(nombre, va);

			return dama;
		case AMARILLO:
			dama = new DamaHonor(nombre, vh);

			return dama;

		case ROJO:
			dama = new DamaHonor(nombre, vp);

			return dama;
		case LAVANDA:
			dama = new DamaHonor(nombre, vs);

			return dama;

		default:
			dama = new DamaHonor(nombre, vs);

			return dama;
		}
	}

}
