package com.inyeccion.dependencias.setters;

public class Principal {

	public static void main(String[] args) {

		// Se crean las damas y se inyecta el vestido que usaran, la inyección se hace por setters
		DamaHonor dama1 = InyectorVestido.getDama("Fer", ColorVestido.NEGRO);
		DamaHonor dama2 = InyectorVestido.getDama("Ale", ColorVestido.AZUL);
		DamaHonor dama3 = InyectorVestido.getDama("Ana", ColorVestido.AMARILLO);
		DamaHonor dama4 = InyectorVestido.getDama("Francia", ColorVestido.ROJO);
		DamaHonor dama5 = InyectorVestido.getDama("Diana", ColorVestido.LAVANDA);

		// imprimirmos los datos de cada dama
		dama1.usarVestido();
		System.out.println();
		dama2.usarVestido();
		System.out.println();
		dama3.usarVestido();
		System.out.println();
		dama4.usarVestido();
		System.out.println();
		dama5.usarVestido();

	}

}
