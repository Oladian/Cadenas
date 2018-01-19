package com.iesvirgendelcarmen.teoria;

import java.util.Scanner;

public class ExpresionesRegulares {
	public static void main(String[] args) {
		// 1- Leer dni valido
		// 2- Leer numero de telefono movil valido
		//
		
		String regex = "^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]?$";
		String telfRegex = "^(\\+?[\\d]){3}[67][\\d]{8}$";
		String decimalRegex = "";
		esValido(leerToken(),regex);
		//esValido(leerToken(),telfRegex);
	}
	
	public static String leerToken() {
		System.out.println("Introduce tu TOKEN");
		Scanner sc = new Scanner(System.in);
		String token = sc.next();
		sc.close();
		
		return token;
	}
		
	public static void esValido(String token, String regex) {
		boolean exito = token.trim().matches(regex);
		System.out.printf("TOKEN %s es valido? %b%n", token, exito);
	}

}
