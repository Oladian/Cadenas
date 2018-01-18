package com.iesvirgendelcarmen.teoria;

import java.util.Scanner;

public class CadenasTelefono {
	public static void main(String[] args) {
		System.out.println("Introduce tu telefono");
		Scanner sc = new Scanner(System.in);
		String telefono = sc.next();
		sc.close();
		
		boolean exitoTelefono = telefono.trim().matches("^(\\+?[0-9]){3}[6-7][0-9]{8}$");
		System.out.printf("El telefono %s ¿es válido? - %b",telefono,exitoTelefono);
	}
}
