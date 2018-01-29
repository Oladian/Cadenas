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
		Scanner sc = new Scanner(new File("C:\\Users\\matinal\\Desktop\\Iz\\constitucion.txt"));
		String string = sc.nextLine();
		ArrayList<String> stringList = new ArrayList<String>();
				
		while (sc.hasNext()) {
			string = sc.next().trim().replaceAll("[\\.,;:\\-¿\\?¡!\\(\\)\"']","");
			
			if (string!=null||string!="") {
				stringList.add(string);
				//System.out.println(string);
			}

		}
		sc.close();
		
		String[] sb500 = new String[500];
		int random = 0;
		
		for (int i=0; i<500; i++) {
			random = (int) (Math.random()*stringList.size());
			sb500[i]=new StringBuilder(stringList.get(random))+"";
		}
		
		StringBuilder builder = new StringBuilder();
		for(String string500 : sb500) {
		    builder.append(string500+" ");
		}
		
		String string500Builded = builder.toString();
		
		System.out.println(wordNumber(string500Builded));
		System.out.println(prepositionNumber(string500Builded));
		System.out.println(determinedArticlesNumber(string500Builded));
		System.out.println(undeterminedArticlesNumber(string500Builded));
		System.out.println(returnUpperCase(300,500,string500Builded));
		
	} 
	
}
