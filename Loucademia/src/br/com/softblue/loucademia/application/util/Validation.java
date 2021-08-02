package br.com.softblue.loucademia.application.util;

import javax.validation.ValidationException;

public class Validation {

	public static void assertNotEmpty(Object obj)  {//Garanta q ñ esta vazio, Object obj para variavel ser do tipo Objeto e aceitar qualquer coisa
		if (obj instanceof String) { // se o obj é do tipo string
			String s = (String) obj; // faço um casting do obj para o tipo string e armazeno o resultado na variavel s.
			if (StringUtils.isEmpty(s)) { // se for vazio...
				throw new ValidationException("O texto não pode ser nulo");
			}
		}
		if (obj == null) { // se obj não for string, tambem dara erro.
			throw new ValidationException("Valor não pode ser nulo");// lança uma nova excessão.
		}
	}
}
 