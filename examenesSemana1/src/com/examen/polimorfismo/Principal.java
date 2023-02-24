package com.examen.polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		//declaracion de una lista tipo CriaturaSobrenatural
		List<CriaturaSobrenatural> criatura = new ArrayList<>();
		
		//seteo de las criaturas en la lista
		criatura.add(new Vampiro("Piberto", 568));
		criatura.add(new HombreLobo("Corline", 100));
		criatura.add(new Bruja("Alicia Salem", 80));
		criatura.add(new Elfo("Krok", 700));
		
		showCriatura(criatura);

	}
	
	private static void showCriatura(List<CriaturaSobrenatural> criatura) {
		int  random = new Random().nextInt(criatura.size());
		//Método que muestra las características de una criatura sobrenatural al azar, recibe Lista de criaturas
		System.out.println(criatura.get(random));
		System.out.println();
		criatura.get(random).getPoder();
		criatura.get(random).getDebilidad();
		criatura.get(random).getDieta();
		criatura.get(random).alimentar();
		System.out.println("Fuerza: "+criatura.get(random).getFuerza());
			
		
	}

}
