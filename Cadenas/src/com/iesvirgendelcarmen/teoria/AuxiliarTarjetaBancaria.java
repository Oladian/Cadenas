package com.iesvirgendelcarmen.teoria;

import java.util.Scanner;
//1234567812345678
//4487653906343876

public class AuxiliarTarjetaBancaria {
	public static void main(String[] args) {
		System.out.println("Introduce el número de la tarjeta.");
		Scanner sc = new Scanner(System.in); // Instanciamos el scanner
		String numeroTarjeta = sc.nextLine();
		sc.close();
		
		String numeroTarjetaReplaced = numeroTarjeta.trim().replaceAll("[-\\s]", "");
		
		// Se admiten espacios en blanco y guiones entre cada 4 numeros
		String regexNumeroCuenta = "\\d{4}(\\s*|-?)\\d{4}(\\s*|-?)\\d{4}(\\s*|-?)\\d{4}(\\s*|-?)"; //Los corchetes muestran opcionalidad
		
		// \\d{4}(\\s*|-?)
		
		boolean valido = numeroTarjeta.trim().matches(regexNumeroCuenta);
		System.out.printf("Comprobacion de %s: %b%n",numeroTarjeta,valido);
		convertirCaracter(numeroTarjetaReplaced);
	}
	
	public static void convertirCaracter(String numeroTarjeta) {
		int suma = 0;
		for (int i=0; i < numeroTarjeta.length()-1;i++) {
			int numero = numeroTarjeta.charAt(i)-48;
			if (i % 2 != 0) {
				numero *=2;
			}
			suma += numero;
		}
		int multiplicacion = (suma *= 9)/10;
		String multiplicacionCadena = multiplicacion+"";
		String ultimoNumero = multiplicacionCadena.substring(multiplicacionCadena.length()-1);
		System.out.println(ultimoNumero);
	}
	
	
}
