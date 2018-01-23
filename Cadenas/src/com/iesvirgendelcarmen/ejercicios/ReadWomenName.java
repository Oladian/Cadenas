package com.iesvirgendelcarmen.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.*;

public class ReadWomenName {
	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayList<String> womenNameListWithA = new ArrayList<String>();
		ArrayList<String> womenNameListWithoutVowels = new ArrayList<String>();
		int counter=0;
		Scanner sc = new Scanner(new File("C:\\Users\\matinal\\Desktop\\nombres_mujer.txt"));
		String cadena = sc.nextLine();
		while (sc.hasNextLine()) { 
			counter++;
			cadena = sc.nextLine();
			if (sc.hasNextLine() && cadena.matches("^[aeiou].*"))
				womenNameListWithA.add(cadena);
			if (sc.hasNextLine() && cadena.matches(".*[^aeiou]$"))
				womenNameListWithoutVowels.add(cadena);
			if (sc.hasNextLine() && cadena.matches(".*[^aeiou]$")){
				
			}
			
		}
			        
		sc.close();
		System.out.println("Nombres de mujeres que empiezan por A: "+womenNameListWithA.toString());
		System.out.println("Nombres de mujeres que no terminan por vocal: "+womenNameListWithoutVowels.toString());
		System.out.println("Palabras leidas: "+counter);
	}	
}

