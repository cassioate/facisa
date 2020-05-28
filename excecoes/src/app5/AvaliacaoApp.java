package app5;

import java.util.Scanner;

public class AvaliacaoApp {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Avaliacao avaliacao = new Avaliacao();
		double nota1 = -1;
		double nota2 = -1;
		
		while(nota1 > 10.0 || nota1 < 0.0) {
			try {
				System.out.print("Digite nota do estágio 1: ");
				nota1 = teclado.nextDouble();
				avaliacao.setNota1(nota1);
				} catch (NotaInvalidaException e) {
					System.out.println(e.getMessage());
				} 
			}
				
			while(nota2 > 10.0 || nota2 < 0.0) {
			try {
				System.out.print("Digite nota do estágio 2: ");
				nota2 = teclado.nextDouble();
				avaliacao.setNota2(nota2);
				} catch (NotaInvalidaException e) {
					System.out.println(e.getMessage());
				}
			}
		System.out.println("Média: " + avaliacao.getMedia());
		teclado.close();
	}
}
