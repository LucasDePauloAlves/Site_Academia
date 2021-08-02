package br.com.softblue.loucademia.application.util;

import javax.validation.ValidationException;

public class Validation {

	public static void assertNotEmpty(Object obj)  {//Garanta q � esta vazio, Object obj para variavel ser do tipo Objeto e aceitar qualquer coisa
		if (obj instanceof String) { // se o obj � do tipo string
			String s = (String) obj; // fa�o um casting do obj para o tipo string e armazeno o resultado na variavel s.
			if (StringUtils.isEmpty(s)) { // se for vazio...
				throw new ValidationException("O texto n�o pode ser nulo");
			}
		}
		if (obj == null) { // se obj n�o for string, tambem dara erro.
			throw new ValidationException("Valor n�o pode ser nulo");// lan�a uma nova excess�o.
		}
	}
}
 