package com.iesvirgendelcarmen.ejercicios;

//https://www.regexpal.com/

public class SafeKey {
	private String key;

	public SafeKey(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}
	
	public boolean isSafeKey() { //8 caracteres, 1 mayus, 1 minus, 1 numero, 1 caracter no alfanumerico
		
		String regexEightChars = "^(?=.*\\d)"
				+ "(?=.*[a-z])"
				+ "(?=.*[A-Z])"
				+ "(?=.*[^a-zA-Z0-9])"
				+ "(?![^aAbBcCdDeEfFgGhHiIjJkKlLmMnNñÑoOpPqQrRsStTuUvVwWxXyYzZ0123456789"
				+ "\\¿\\?\\(\\)\\=\\@\\.\\:\\,\\;\\!\\¡\\&\\~\\ \\{\\}]).{8,}$"; 

		return getKey().matches(regexEightChars);
		
		/*
		 * Description

			(					# Start of group
			  (?=.\d)			#   must contains one digit from 0-9
			  (?=.[a-z])		#   must contains one lowercase characters
			  (?=.[A-Z])		#   must contains one uppercase characters
			  
			  
			  (?![^aAbBcCdDeEfFgGhHiIjJkKlLmMnNñÑoOpPqQrRsStTuUvVwWxXyYzZ0123456789"
				+ "\\¿\\?\\(\\)\\=\\@\\.\\:\\,\\;\\!\\¡\\&\\~\\ \\{\\}])
				
								#   must contains one special symbols in the list and no others
			  .					#     match anything with previous condition checking
			  {8,}				#        length at least 8 characters and maximum of N
			)					# End of group
		 *	
		 *	 */
	}
}
