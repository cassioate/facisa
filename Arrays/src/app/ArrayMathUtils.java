package app;

import java.util.Arrays;

public class ArrayMathUtils {
	
	
	public static int[] calculaDivisores(int num){
		int array[] = new int[num];
		int contador = 0;
		
		for(int i = 0; i < array.length; i++) {
			array[i]=i+1;
		}
			
		for (int i = 0; i < num; i++) {
			if (num%array[i] == 0) {
				contador += 1;				
			}
		}
		int[] novoArray = new int[contador];
		int contador2 = 0;
		for (int i = 0; i < array.length; i++) {
			if (num%array[i] == 0) {
				novoArray[contador2] = array[i];
				contador2+=1;
			}
		}
		return novoArray;
	}
	
	public static double computaMaior(double[] num) {
		double contador = num[0] ;
			for (int i = 1; i < num.length; i++) {
				if (num[i] > num[i-1] && num[i] > contador) {
					contador = num[i];
				}
			}
			return contador;
			
	}
	
	public static double computaMenor(double[] num) {
		double contador = num[0] ;
			for (int i = 1; i < num.length; i++) {
				if (num[i] < num[i-1] && num[i] < contador) {
					contador = num[i];
				}
			}
			return contador;
			
	}
	
	public static double computaMedia(double[] num) {
		double total = 0;
			for (int i = 0; i < num.length; i++) {
				total += num[i];
				}
			double media = total/num.length;
			return media;
			
	}
	
	public static boolean temNumRepetido(double[] num) {
		Arrays.sort(num);
		boolean valor = false;
		for (int i = 1; i<num.length; i++) {
			if (num[i] == num[i-1]) {
				valor = true;
			}
		}
		return valor;
	}
	
	public static int[][] somaMatrizes(int[][] m1, int[][] m2){
		
		int[][] novaMatriz = new int [m1.length][m2[0].length];
		for (int i = 0; i < m1.length; i++) {
			
			for (int j = 0; j <m1[0].length; j++) {
				novaMatriz[i][j] = m1[i][j]+m2[i][j];
			}
		}
		return novaMatriz;
	}	
		
	public static String printArrayBidimensional(int[][] v) {
			String aux = "";
			
			for (int i = 0; i < v.length; i ++) {
				for (int j = 0; j < v[i].length; j ++) {

						aux += (v[i][j] + " ");
			
					}
				aux += "\n";
			}
			return aux;
	}
	
}


	
