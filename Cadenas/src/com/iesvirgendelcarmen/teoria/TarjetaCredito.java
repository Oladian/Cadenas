package com.iesvirgendelcarmen.teoria;

/* fuentes usadas: 
 * https://www.pcihispano.com/el-algoritmo-de-luhn-y-su-importancia-para-la-validacion-de-tarjetas-de-pago/
 * http://www.intranus.net/archivos/ALGORITMO%20DE%20LAS%20TARJETAS%20DE%20CREDITO.htm
 */

 /* Ejemplos de números:
  * 1234567812345678 (no valido)
  * 4487653906343876 (valido)
  * 4168818844447115 (valido)
  * 1234123412341234 (no valido)
  * 2345234523452345
  */
import java.util.Scanner;

public class TarjetaCredito {
	public static void main(String[] args) {
		
		System.out.println("Introduzca la tarjeta de crédito");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();
		
		String regex = "[\\d]{16}";
		
		boolean valido = input.trim().matches(regex);
		System.out.println("¿Numero de tarjeta valido? - "+valido);
		convertirCaracter(input);
		
		if (valido) {
			System.out.println(testDeLuhn(input));
		}	
	}
	
	public static boolean testDeLuhn(String input) {
		int suma1 = 0;
		int suma2 = 0;
		String inputDelReves = new StringBuilder(input).reverse().toString(); //ES IMPORTANTE DARLE LA VUELTA, para que sea String hay que convertirlo con toString()
		
		for (int i=0; i<inputDelReves.length();i++) {
			int digito = Character.digit(inputDelReves.charAt(i), 10);
			if(i%2 == 0) {
				suma1 += digito;
				//System.out.println("Indice par - "+i+ " Suma - "+suma1);
			} else {
				suma2 += 2*digito;
				//System.out.println("Indice impar - "+i+ " Suma - "+suma2);
				if (digito >=5 ) {
					suma2 -=9;
				//	System.out.println("DIGITO "+digito);
				}
			} 
		}
		System.out.println("La tarjeta es: ");
		return ((suma1+suma2))%10==0;
	}
	
	public static void convertirCaracter(String numeroTarjeta) {
		int suma = 0;
		for (int i=0; i < numeroTarjeta.length()-1;i++) {
			int numero = numeroTarjeta.charAt(i)-48;
			if (i % 2 != 0) {
				numero *=2;
			}
			suma += numero;
		}
		int multiplicacion = suma *= 9;
		String multiplicacionCadena = multiplicacion+"";
		String ultimoNumero = multiplicacionCadena.substring(multiplicacionCadena.length()-1);
		System.out.println("Ultimo numero "+ultimoNumero);
	}
}

