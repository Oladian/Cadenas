package com.iesvirgendelcarmen.ejercicios;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class StringUtilities {
	public static final String[] DETERMINED_ARTICLES = {"el","la","los","las"};
	public static final String[] UNDETERMINED_ARTICLES = {"un","una","unos","unas"};
	public static final String[] PREPOSITIONS = {"a","ante","bajo","cabe","con","contra","de","desde","en","entre","hacia","hasta","para","por","según","sin","so","sobre","tras"}; 

	public static int wordNumber(String phrase) {
		System.out.printf("Cantidad de palabras: ");
		return phrase.trim().split("\\s+").length;
	}
	
	public static int prepositionNumber(String phrase) {
		System.out.printf("Numero de preposiciones encontradas: ");
		int counter=0;
		String phraseParts[] = phrase.trim().split("\\s+");
		for (int i = 0; i<phraseParts.length;i++)
			for (int j = 0; j<PREPOSITIONS.length;j++)
				if(phraseParts[i].toLowerCase().equals(PREPOSITIONS[j])) {
					counter++;
				}
		
		// forma correcta
		int counter2 = 0;
		
		List<String> prepList = Arrays.asList(PREPOSITIONS);
		for (String string : phraseParts) {
			if(prepList.contains(string)) {
				counter2++;
			}
		}

		return counter2;
		
		
	}
	
	public static int determinedArticlesNumber(String phrase) {
		System.out.printf("Numero de articulos determinados encontrados: ");
		int counter=0;
		String phraseParts[] = phrase.trim().split("\\s+");
		for (int i = 0; i<phraseParts.length;i++)
			for (int j = 0; j<DETERMINED_ARTICLES.length;j++)
				if(phraseParts[i].toLowerCase().equals(DETERMINED_ARTICLES[j])) {
					counter++;
				}
		return counter;
	}
	
	public static int undeterminedArticlesNumber(String phrase) {
		System.out.printf("Numero de articulos indeterminados encontrados: ");
		int counter=0;
		String phraseParts[] = phrase.split("\\s+");
		for (int i = 0; i<phraseParts.length;i++)
			for (int j = 0; j<UNDETERMINED_ARTICLES.length;j++)
				if(phraseParts[i].toLowerCase().equals(UNDETERMINED_ARTICLES[j])) {
					counter++;
				}
		return counter;
	}
	
	public static String returnUpperCase(int start, int end, String phrase) {

		
		if (start >= end || start > phrase.length() || end > phrase.length())
			return phrase;
		else {
			/*String firstString = phrase.substring(0, start);
			String middleString = phrase.substring(start, end);
			String lastString = phrase.substring(end);

			StringBuilder sBuilder = new StringBuilder();
			sBuilder.append(firstString);
			sBuilder.append(middleString.toUpperCase());
			sBuilder.append(lastString);
			
			return sBuilder.toString();*/
			System.out.printf("De %d a %d en mayúsculas: ", start, end);
			String phraseParts[] = phrase.split("\\s+");
			StringBuilder builder = new StringBuilder();
			for (int i = start; i<end;i++)
				builder = builder.append(phraseParts[i].toUpperCase()+" ");
	
			String phraseToString = builder.toString();
			return phraseToString;
		}
	}
}
