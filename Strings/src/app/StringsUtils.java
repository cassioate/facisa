package app;
import java.util.Arrays;

public class StringsUtils {

//		1)	
		public static String formataAtributo(String palavraOriginal) {
		
			String palavraNova = "";
			
			String palavra = palavraOriginal.toLowerCase();
			
				for (String a : palavra.split(" ")) {
					
						palavraNova += a.substring(0,1).toUpperCase();
						palavraNova += a.substring(1, a.length());
				}
				
			String palavraFinal = "";
					
			palavraFinal += palavraNova.substring(0,1).toLowerCase();	
			palavraFinal += palavraNova.substring(1, palavraNova.length());
			
			return palavraFinal;
		
			}
		
//		2)
		public static String formataMetodo (String frase) {
				
			String palavraNova = "";
			
			String palavra = frase.toLowerCase();
			
				for (String a : palavra.split(" ")) {
					
						palavraNova += a.substring(0,1).toUpperCase();
						palavraNova += a.substring(1, a.length());
				}
				
			String palavraFinal = "";
					
			palavraFinal += palavraNova.substring(0,1).toLowerCase();	
			palavraFinal += palavraNova.substring(1, palavraNova.length());
			
			return palavraFinal;
		}
		
//		3)
		public static String formataClasse (String frase) {
				
			String palavraNova = "";
			
			String palavra = frase.toLowerCase();
			
				for (String a : palavra.split(" ")) {
					
						palavraNova += a.substring(0,1).toUpperCase();
						palavraNova += a.substring(1, a.length());
				}
				
		
			return palavraNova;
				
			
		}
		
//		4)
		public static String ordenaStrings (String palavra, String palavra2) {
					
					String n[] = new String[2];
					
					n[0] = palavra;
					n[1] = palavra2;
					
//					Ordena em ordem Crescente.
					Arrays.sort(n);
			
			String output = n[0] + " " + n[1];
					return output;
			}
		

//		5)
		public static boolean ehPalindromo (String palavra) {
			
			String novaPalavra = palavra;
			
			
			StringBuffer nome2 = new StringBuffer(novaPalavra);
			StringBuffer palavraInvertida = nome2.reverse();
			
			if (novaPalavra.contentEquals(palavraInvertida)) {
				
				return true;	
			}
			
			else {
				return false;
							
			}
		}
		
//		6) - 
		public static String transformaParaCaixaAlta (String palavra) {
					
			return palavra.toUpperCase();
	
		}
		
//		7) -
		public static int contaVogais (String frase) {
			
			int quantidade = frase.length();
			String n[] = new String[quantidade];
			int contador = 0;
			int contadorSub = 0;
			int contadorVogais = 0;
			
			for (int i = 0; contadorSub < quantidade; i++) {
				n[i] = frase.substring(i,i+1);
				contadorSub +=1;
			}
			
			for (int i = 0; contador < quantidade; i++) {
				
					if (n[i].contains("A")) {
						contadorVogais += 1;		
						contador += 1;
					}
					else if (n[i].contains("E")) {
						contadorVogais += 1;						
						contador += 1;
						
					}
					else if (n[i].contains("I")) {
						contadorVogais += 1;						
						contador += 1;
						
					}
					else if (n[i].contains("O")) {
						contadorVogais += 1;						
						contador += 1;
						
					}
					else if (n[i].contains("U")) {
						contadorVogais += 1;
						contador += 1;
					
					}
					else if (n[i].contains("a")) {
						contadorVogais += 1;						
						contador += 1;
						
					}
					else if (n[i].contains("e")) {
						contadorVogais += 1;						
						contador += 1;
						
					}
					else if (n[i].contains("i")) {
						contadorVogais += 1;						
						contador += 1;
						
					}
					else if (n[i].contains("o")) {
						contadorVogais += 1;
						contador += 1;
					}
					
					else if (n[i].contains("u")) {
						contadorVogais += 1;
						contador += 1;
								
					}
					else {
						contador+=1;
				}
				
				
			}
			
			return contadorVogais;
				
		}
		
//		8) -		
		public static String removeEspacosSuperfluos (String palavra) {
			
			return palavra.trim();
	
		}
		

//		9) -
		public static int[] ocorrencias (String frase, String subPalavra){
			
			int contador = 0;
			String fraseModificada = frase.toLowerCase();
			String subPalavraModificada = subPalavra.toLowerCase();
			String[] palavraNova = fraseModificada.split(" ");
							
			for(String a : palavraNova) {
				
				if(a.contains(subPalavraModificada)) {
				contador += 1;
				}
			}
			
			int[] local = new int [contador];
			
			int contador2 = 0;
			
			for (int i = 0; i < local.length; i++){
			local[i] = frase.indexOf(subPalavraModificada, contador2);
			contador2 = frase.indexOf(subPalavraModificada, contador2) + 1;
			}	
			
			return local;	
	}
		
//		10) - 
		public static int binarioPraDecimal (String binario) {
			
			int quantidade = binario.length();
			String[] binarioString = new String [quantidade];
			int[] resultado = new int[quantidade];
			int resultadoFinal = 0;
						
			for (int i = 0; i < quantidade; i++) {
				binarioString[i] = binario.substring(i, i+1);
			}
			
			int contadorInvertido = binarioString.length-1;
			
			for(int i = 0; i < binarioString.length; i++) {
				resultado[contadorInvertido] = Integer.valueOf(binarioString[i]);
				contadorInvertido -= 1;
				
			}
			
			for (int i = 0; i < resultado.length; i++) {
				if(resultado[i]>0) {
				resultadoFinal += Math.pow(resultado[i]*2, i);
				}
				else {
					resultadoFinal += 0;
				}
			}
			return resultadoFinal;
		}
		
//		11) -
		public static int getQtdadePalavras(String frase) {
			String[] novaFrase = frase.split(" ");
			int tamanho = novaFrase.length;
			return tamanho;
			
		}
		
//		12) -
		public static int[] histogramaLetras(String texto) {
			String textoUpperCase = texto.toUpperCase();
			String[] textoArray = textoUpperCase.split("");
			int[] vezes = new int [26];
			
			
			for(int i = 0; i < textoUpperCase.length(); i++) {
				
				if(textoArray[i].equals("A")) {
					vezes[0]+=1;
				}
				if(textoArray[i].equals("B")) {
					vezes[1]+=1;
				}
				if(textoArray[i].equals("C")) {
					vezes[2]+=1;
				}
				if(textoArray[i].equals("D")) {
					vezes[3]+=1;
				}
				if(textoArray[i].equals("E")) {
					vezes[4]+=1;
				}
				if(textoArray[i].equals("F")) {
					vezes[5]+=1;
				}
				if(textoArray[i].equals("G")) {
					vezes[6]+=1;
				}
				if(textoArray[i].equals("H")) {
					vezes[7]+=1;
				}
				if(textoArray[i].equals("I")) {
					vezes[8]+=1;
				}
				if(textoArray[i].equals("J")) {
					vezes[9]+=1;
				}
				if(textoArray[i].equals("K")) {
					vezes[10]+=1;
				}
				if(textoArray[i].equals("L")) {
					vezes[11]+=1;
				}
				if(textoArray[i].equals("M")) {
					vezes[12]+=1;
				}
				if(textoArray[i].equals("N")) {
					vezes[13]+=1;
				}
				if(textoArray[i].equals("O")) {
					vezes[14]+=1;
				}
				if(textoArray[i].equals("P")) {
					vezes[15]+=1;
				}
				if(textoArray[i].equals("Q")) {
					vezes[16]+=1;
				}
				if(textoArray[i].equals("R")) {
					vezes[17]+=1;
				}
				if(textoArray[i].equals("S")) {
					vezes[18]+=1;
				}
				if(textoArray[i].equals("T")) {
					vezes[19]+=1;
				}
				if(textoArray[i].equals("U")) {
					vezes[20]+=1;
				}
				if(textoArray[i].equals("V")) {
					vezes[21]+=1;
				}
				if(textoArray[i].equals("W")) {
					vezes[22]+=1;
				}
				if(textoArray[i].equals("X")) {
					vezes[23]+=1;
				}
				if(textoArray[i].equals("Y")) {
					vezes[24]+=1;
				}
				if(textoArray[i].equals("Z")) {
					vezes[25]+=1;
				}
			
			}
			
			return vezes;
			
		}
}
		


			


	