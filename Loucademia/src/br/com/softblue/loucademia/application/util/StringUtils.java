package br.com.softblue.loucademia.application.util;

public class StringUtils {

	//Método public para que possa ser utilizado de qualquer lugar...
	//Static para que possa ser acessado de qualquer classe sem a necessidade de instancia-la.
	//Método para verificar se a string esta vazia.
	public static boolean isEmpty(String s) {
		if (s == null) {
			return true;
		}
		
		return s.trim().length() == 0;
		//.trim tira os espaços vazios e em brancos, o método length pega o restante
		// que sobrou e retorna a string.
	}
	
	public static String leftZeroes(int value, int finalSize) {
		return String.format("%0" + finalSize + "d", value);
	//digo que ira colocar %0 zeros a esquerda e digo a quantidade em finalSize
	//coloco "d" para dizer que são numeros e value passando o numero
	}
	
	public static void main(String[] args) {
		
		final String dentro_tem = ", dentro tem:";
		
		String vazia = "" ;
		String preenchida = "" ;
		
		String str = "lucas de ";
		
		
		boolean b = StringUtils.isEmpty(str);
		
		if (b == true) {
			vazia = "vazia" ;
			System.out.println(vazia + dentro_tem + str + ", com: " + str.length() + " caracteres." );
		} else {
			preenchida = "Preenchida";
			System.out.println(preenchida + ", dentro tem: " + str + ", com: " + str.length() + " caracteres.");
		}
		
	
		int v = 1098;
		System.out.println(StringUtils.leftZeroes(v, 6));
	}
}
