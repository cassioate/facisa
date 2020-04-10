package app;

import java.util.Arrays;

public class Strings {
	
	public static void main(String[] args) {

//		1) - 
		System.out.println(StringsUtils.formataAtributo("Quantidade de coisas"));
			
		System.out.println("------------------------------------");
		
//		2) -
		System.out.println(StringsUtils.formataMetodo("get quantidade de questoes"));
		
		System.out.println("------------------------------------");
		
//		3) -		
		System.out.println(StringsUtils.formataClasse("formatador de identificadores"));
		
		System.out.println("------------------------------------");
		
//		4) -
		System.out.println(StringsUtils.ordenaStrings("volkswagen", "ford"));
		System.out.println("------------------------------------");
		
//		5) -
		System.out.println(StringsUtils.ehPalindromo("arara"));
		System.out.println("------------------------------------");
		
//		6) -
		System.out.println(StringsUtils.transformaParaCaixaAlta("PhUlaNo dEtHal"));
		System.out.println("------------------------------------");
		
//		7) -
		System.out.println("Serão: "+StringsUtils.contaVogais("In God We Trust")+" Vogais");
		System.out.println("------------------------------------");
		
//		8) -
		System.out.println(StringsUtils.removeEspacosSuperfluos(" Hay que endurecerse, pero sin perder la ternura jamás "));
		System.out.println("------------------------------------");
		
//		9) -
		int[] ocorrencias = StringsUtils.ocorrencias("O doce perguntou para o doce, qual o doce mais doce?", "doce");
		System.out.println(Arrays.toString(ocorrencias));
		System.out.println("------------------------------------");
		
//		10) -
		System.out.println(StringsUtils.binarioPraDecimal("1100110011"));
		System.out.println("------------------------------------");
		
//		11) -
		System.out.println(StringsUtils.getQtdadePalavras("programar é muito facil"));
		System.out.println("------------------------------------");
		
//		12) -
		int[] histogramaLetras = StringsUtils.histogramaLetras("the quick brown fox jumps over the lazy dog");
		System.out.println(Arrays.toString(histogramaLetras));
		System.out.println("------------------------------------");
		
	}
	
}