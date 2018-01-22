package com.iesvirgendelcarmen.ejercicios;

import java.util.Scanner;

public class TestSafeKey {
	public static void main(String[] args) {
	
		System.out.println("Introduce la contraseña");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();
		
		SafeKey key1 = new SafeKey(input);
		
		System.out.printf("¿La clave \"%s\" es segura? - %b%n",key1.getKey(),key1.isSafeKey());
		SafeKey key2 = new SafeKey(randomKey());
		System.out.printf("¿La clave \"%s\" es segura? - %b%n",key2.getKey(),key2.isSafeKey());
	}

	public static String randomKey() {
		
		final String FUENTE_CARACTERES = "aAbBcCdDeEfFgGhHiIjJkKlLmMnN˜nNoOpPqQrRsStTuUvVwWxXyYzZ0123456789¿?()=@.:,;!¡&˜ {}";
		int random = 0;
		int randomLength = (int)(Math.random()*FUENTE_CARACTERES.length()-1);
		String randomGeneratedKey = "";		
		
		for (int i=0; i<randomLength; i++) {
			random = (int)((Math.random() * FUENTE_CARACTERES.length()-1)+1);
			randomGeneratedKey+=FUENTE_CARACTERES.charAt(random)+"";
		}
		return randomGeneratedKey;
	}

}
