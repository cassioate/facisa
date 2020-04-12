package app;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
//		1) - 
		int [] calculaDivisores = ArrayMathUtils.calculaDivisores(32);
		System.out.println(Arrays.toString(calculaDivisores));
		System.out.println("------------------------------------");
		
//		2) -
		System.out.println(ArrayMathUtils.computaMaior(new double [] {12.4, 43.1, 4.3, 54.0, 6.7}));
		System.out.println("------------------------------------");
//		3) -
		System.out.println(ArrayMathUtils.computaMenor(new double [] {12.4, 43.1, 4.3, 54.0, 6.7}));
		System.out.println("------------------------------------");
//		4) -
		System.out.println(ArrayMathUtils.computaMedia(new double [] {12.4, 43.1, 4.3, 54.0, 6.7}));
		System.out.println("------------------------------------");
//		5)-
		System.out.println(ArrayMathUtils.temNumRepetido(new double [] {12.4, 4.3, 54.0, 12.4}));
		System.out.println("------------------------------------");
//		6) -
		int[][] somaMatrizes = ArrayMathUtils.somaMatrizes(new int [][] {{5,4},{0,2},{1,-1}}, new int[][] {{0,-2},{5,-3},{-1,0}});
		System.out.print(ArrayMathUtils.printArrayBidimensional(somaMatrizes));
		System.out.println("------------------------------------");
//		7) -
		
		
	}

}
