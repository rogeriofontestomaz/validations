package br.com.everis.util;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class RemoverAcentosUtil {
	
	
	
	private static final String TEXTO = "� um acento gr�fico colocado apenas sobre a vogal a, indicando que h� crase, ou seja, a contra��o da preposi��o a com outra palavra. � usado em poucas palavras:";

	private RemoverAcentosUtil() {
		System.out.println("Essa � uma classe de Utilidade, n�o pode ser declarada");
	}

	public static String deAccent(String str) {
		String nfdNormalizedString = Normalizer.normalize(str, Normalizer.Form.NFD);
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		return pattern.matcher(nfdNormalizedString).replaceAll("");
	}
	
	public static void main(String[] args) {
		System.out.print(deAccent(TEXTO));
	}
}


