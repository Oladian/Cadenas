package com.iesvirgendelcarmen.ejercicios;
/*
 * 	Crea una clase denominada PalabraLeida, que tenga como unico atributo un
	String denominado valor y que contenga los siguientes metodos:
		NumeroDeLetras()
		EmpiezaPorVocal()
		AcabaEnVocal()
		NumeroDeVocales()
		ContieneH()
		EsUnPalindromo()
		SonIguales(String palabra):boolean (sin tener en cuenta mayusculas o minusculas)

	Una palabra es un palındromo si al leerla de izquierda a derechas es la misma
	palabra leida en sentido contrario, ejemplo reconocer, rotor, salas, seres, somos.
	Posteriormente crea una clase denominada TestPalabraLeida que compruebe el
	funcionamiento de dicha clase y lea la palabra mediante la clase Scanner.
	Para comprobar el funcionamiento del m´etodo SonIguales(String palabra):boolean
	utiliza los argumentos del programa principal para obtener el par´ametro String
	de dicho metodo.
	Genera la documentacion de la clase PalabraLeida y el diagrama UML de la
	misma.
	Crea un fichero jar ejecutable que compruebe el funcionamiento del TestPalabraLeid
 */


public class ReadWord {
	static String valor = "ahaecOnOceaha".toLowerCase();	
	
	public static void main(String[] args) {
		System.out.printf("%s%nNumero de letras: %d%n"
				+ "Empieza por vocal: %b%n"
				+ "Termina por vocal: %b%n"
				+ "Cantidad de vocales: %d%n"
				+ "Contiene H: %b%n"
				+ "Es palindromo: %b%n"
				+ "Son iguales: %b%n",
				valor,numberOfLetters(),startWithVowel(),
				endsWithVowel(),numberOfVowels(),containsH(),
				isPalindrome(),areEquals("ahaeconoceaha"));
	}
	
	public static int numberOfLetters() {
		return valor.length();
	}
	
	public static boolean startWithVowel() {
		/*String lowerString = valor.toLowerCase();
		return lowerString.startsWith("a")||lowerString.startsWith("e")||lowerString.startsWith("i")
				||lowerString.startsWith("o")||lowerString.startsWith("u");*/
		return valor.trim().matches("^[aeiou]+[\\w]*"); // -> ^[aeiouáéíóíú].*
	}
	
	public static boolean endsWithVowel() {
		return valor.trim().matches("[\\w]*[aeiou]$"); // -> [\\w]*[aeiou]$
	}
	
	public static int numberOfVowels() {
		int sum = 0;
		for (int i=0; i < valor.length();i++) {
		/*	if(valor.charAt(i) == 'a' 
				||valor.charAt(i) == 'e' 
				||valor.charAt(i) == 'i' 
				||valor.charAt(i) == 'o' 
				||valor.charAt(i) == 'u') {
					sum+=1; 
			}*/
			String word = new String(valor.toLowerCase().charAt(i)+""); //consume mas memoria
			if (word.matches("[aeiou]")) {
				sum+=1;
			}
		
		}
		return sum;
	}
	public static boolean containsH() {
		return valor.contains("h");
	}
	
	public static boolean isPalindrome() {
		String reversedValor = new StringBuilder(valor).reverse().toString();
		return valor.equals(reversedValor);
	}
	
	public static boolean areEquals(String word) {
		return valor.equalsIgnoreCase(word.toLowerCase());
	}
}
