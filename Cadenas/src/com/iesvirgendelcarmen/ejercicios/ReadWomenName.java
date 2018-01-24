package com.iesvirgendelcarmen.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.*;

public class ReadWomenName {
	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<String> stringList = new ArrayList<String>();
		Scanner sc = new Scanner(new File("C:\\Users\\matinal\\Desktop\\nombres_mujer.txt"));
		String cadena = sc.nextLine();
		
		int counter=0;

		while (sc.hasNextLine()) { 
			counter++;
			cadena = sc.nextLine();
			stringList.add(cadena);
		}
		sc.close();
		
		if (args.length>0) {
			System.out.printf("%s alredy exists? - %b",args[0],argsExistInFile(args[0], stringList));
		} else {	
		System.out.println(listWithA(stringList));
		System.out.println(listWithoutVowels(stringList));
		System.out.println("Lista con nombres mas largos: "+getLargerNames(stringList));
		System.out.println("Lista con nombres mas cortos: "+getShorterNames(stringList));
		System.out.println("Palabras leidas: "+counter);
		}	
	}
	
	public static ArrayList<String> listWithA (ArrayList<String> stringList){
		ArrayList<String> womenNameListWithA = new ArrayList<String>();
		for (int i = 0; i<stringList.size();i++) {
			if (stringList.get(i).toString().matches("^[aeiou].*")) {
				womenNameListWithA.add(stringList.get(i));
			}
		}
		System.out.println("Nombres de mujeres que empiezan por A: ");
		return womenNameListWithA;
	}
	
	public static ArrayList<String> listWithoutVowels (ArrayList<String> stringList){
		ArrayList<String> womenNameListWithoutVowels = new ArrayList<String>();
		
		for (int i = 0; i<stringList.size();i++) {
			if (stringList.get(i).toString().matches(".*[^aeiou]$")) { 
				womenNameListWithoutVowels.add(stringList.get(i));
			}
		}
		System.out.println("Nombres de mujeres que no terminan por vocal: ");
		return womenNameListWithoutVowels;
	}
	
	
	public static ArrayList<String> getLargerNames (ArrayList<String> stringList) {
		ArrayList<String> womenLargerNameList = new ArrayList<String>();
		String largerString = stringList.get(0);
		
		womenLargerNameList.add(largerString);
		if (womenLargerNameList.size()==0)
			return womenLargerNameList;
		
		for (int i=1; i<stringList.size();i++) {
			if (stringList.get(i).length()>largerString.length()) {
				womenLargerNameList.clear();
				womenLargerNameList.add(stringList.get(i));
				largerString = stringList.get(i);
			}
			
			if (stringList.get(i).length()==largerString.length())
				womenLargerNameList.add(stringList.get(i));
		}
		
		return womenLargerNameList;
	}
	
	public static ArrayList<String> getShorterNames (ArrayList<String> stringList) {
		ArrayList<String> womenLargerNameList = new ArrayList<String>();
		String largerString = stringList.get(0);
		
		womenLargerNameList.add(largerString);
		if (womenLargerNameList.size()==0)
			return womenLargerNameList;
		
		for (int i=1; i<stringList.size();i++) {
			if (stringList.get(i).length()<largerString.length()) {
				
				womenLargerNameList.clear();
				womenLargerNameList.add(stringList.get(i));
				largerString = stringList.get(i);
			}
			
			if (stringList.get(i).length()==largerString.length())
				womenLargerNameList.add(stringList.get(i));
		}
		
		return womenLargerNameList;
	}
	
	public static boolean argsExistInFile(String args, ArrayList<String> stringList) {
		boolean exist = false;
		for (int i=0;i<stringList.size();i++) {
			if (args.equals(stringList.get(i).toString())) {
				exist=true;
			}
		}
		return exist;
	}
}

