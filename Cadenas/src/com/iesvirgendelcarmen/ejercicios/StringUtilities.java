package com.iesvirgendelcarmen.ejercicios;

public class StringUtilities {
	public static final String[] DETERMINED_ARTICLES = {"el","la","los","las"};
	public static final String[] UNDETERMINED_ARTICLES = {"un","una","unos","unas"};
	public static final String[] PREPOSITIONS = {"a","ante","bajo","cabe","con","contra","de","desde","en","entre","hacia","hasta","para","por","según","sin","so","sobre","tras"}; 

	public static int wordNumber(String[] phrase) {
		return phrase.length;
	}
	
	public static int prepositionNumber(String[] phrase) {
		int counter=0;
		for (int i = 0; i<phrase.length;i++)
			for (int j = 0; j<PREPOSITIONS.length;j++)
				if(phrase.equals(PREPOSITIONS[j])) {
					counter++;
				}
		return counter;
	}
	
	public static int determinedArticlesNumber(String phrase) {
		return 0;
	}
	
	public static int undeterminedArticlesNumber(String phrase) {
		return 0;
	}
	
	public static String returnUpperCase(int start, int end, String phrase) {
		return "";
	}
}
