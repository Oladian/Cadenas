package com.iesvirgendelcarmen.teoria;

import java.awt.image.ReplicateScaleFilter;
import java.util.Scanner;

public class ManipularDouble {
	public static void main(String[] args) {
		
		// leer scanner
		// aplicar la exp regular
		// reemplazar las comas por puntos
		// convertir string a doublea
		// mostrar raiz cubica
		// [\\d] = [0-9]
		//String decimalRegex = "^(\\-?[\\d]?)||(\\-?[\\d]*\\.?[\\d]*)";
		
		System.out.println("Introduce tu TOKEN");
		Scanner sc = new Scanner(System.in);
		String token = sc.next();
		sc.close();
		token = token.replace(',', '.');
		
		String decimalRegex = "^\\-?[\\d]+([.][\\d]+)?$";
		boolean valido = token.trim().matches(decimalRegex);
		
		if (valido) {
			double convertido = Double.parseDouble(token);
			System.out.printf("Raiz cubica de %s vale %.3f",token,Math.cbrt(convertido));
		}	
	}
}
