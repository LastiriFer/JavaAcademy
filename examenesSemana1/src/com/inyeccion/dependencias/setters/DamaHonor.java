package com.inyeccion.dependencias.setters;

public class DamaHonor {

	private String nombre;
	private Vestido vestido;


	// método usarVestido imprime el nombre y el vestido a usar
	void usarVestido() {
		System.out.println(nombre);

		vestido.usar();
	}
	//sección gettes and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Vestido getVestido() {
		return vestido;
	}

	public void setVestido(Vestido vestido) {
		this.vestido = vestido;
	}
	
	

}
