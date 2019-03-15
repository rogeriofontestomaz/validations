package br.com.everis.util;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class RemoverAcentosUtil {
	
	
	
	private static final String TEXTO = "É um acento gráfico colocado apenas sobre a vogal a, indicando que há crase, ou seja, a contração da preposição a com outra palavra. É usado em poucas palavras:";

	private RemoverAcentosUtil() {
		System.out.println("Essa é uma classe de Utilidade, não pode ser declarada");
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


