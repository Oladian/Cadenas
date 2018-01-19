package com.iesvirgendelcarmen.teoria;

import java.util.Arrays;

public class Cadenas1 {
	public static void main(String[] args) {
		String cadena1 = "hola";
		String cadena2 = "hola";
		String cadena3 = new String("hola");
		//String cadena4 = new String("holaa");
		
		System.out.println("cadena1==cadena2 "+(cadena1==cadena2));
		System.out.println("cadena2==cadena3 "+(cadena2==cadena3));
		System.out.println("CONTENIDO cadena1==cadena2 "+cadena1.equals(cadena2));
		System.out.println("CONTENIDO cadena1==cadena3 "+cadena1.equals(cadena3));
		
		String cadena5 = "Hola mundo desde programación java";
		
		String[] cadenaDividida = cadena5.split(" ");
		System.out.println(Arrays.toString(cadenaDividida)); //Muestra los Strings en lugar de su posición en memoria
		System.out.println(cadenaDividida);
		String outputCadena = String.format("%d/%S/%d", 17,"enero",2018);
		System.out.println(outputCadena);
	}
}
