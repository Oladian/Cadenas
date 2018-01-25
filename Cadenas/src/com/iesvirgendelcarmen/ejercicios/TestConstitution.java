package com.iesvirgendelcarmen.ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.*;
import static com.iesvirgendelcarmen.ejercicios.StringUtilities.*;

public class TestConstitution {

	public static void main(String[] args) throws FileNotFoundException {
	
		//Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(new File("C:\\Users\\matinal\\Desktop\\constitucion.txt"));
		String string = sc.nextLine();
		ArrayList<String> stringList = new ArrayList<String>();
		int counter=0;
		
		while (sc.hasNext()) {
			string = sc.next().trim().replaceAll("[\\.,;:\\-]","");
			
			if (string!=null||string!="") {
				stringList.add(string);
				counter++;
				System.out.println(string);
			}

		}
		sc.close();
		
		/*		while (sc.hasNextLine()) {
		
		Scanner sc2 = new Scanner(sc.nextLine());
		
		while(sc2.hasNext()){
			string = sc2.next().trim();
			stringList.add(string);
			counter++;
		}
	}*/

		String[] sb500 = new String[500];
		int random = 0;
		
		for (int i=0; i<500; i++) {
			random = (int) (Math.random()*stringList.size());
			sb500[i]=new StringBuilder(stringList.get(random))+"";
		}
		//System.out.println(sb500[3]);
		System.out.println(wordNumber(sb500));
		System.out.println(prepositionNumber(sb500));
	} 
	
}
