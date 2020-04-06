package app;

import app.Carro;
public class Loja {

	public static void main(String[] args) {
		
		Carro palio = new Carro("Palio", "Fiat", 35000);
		Carro palioPrata = new Carro("Palio", "Fiat", "PRATA", 2, false, false, false, false, 35000);
		Carro civic = new Carro("Civic", "Honda", "BRANCO", 4, true, true, true, true, 110000);
		Carro corola = new Carro("Corolla", "Toyota", "BRANCO", 4, true, true, false, true, 110000);
		Carro gol = new Carro();
		gol.nome = "Gol";
		gol.marca = "Volkswagen";
		gol.cor = "BRANCO";
		gol.portas = 2;
		gol.vidroEletrico = false;
		gol.arCondicionado = false;
		gol.cambioAutomatico = false;
		gol.direcaoEletrica = false;
		gol.precoBase = 55000;
		
//		Primeiro print:	
		//		Quest�o 1:
		
//		Carro.promocao = false;
		
		//		Quest�o 2:	
		palio.promocao = false;
		palioPrata.promocao = false;
		civic.promocao = false;
		corola.promocao = false;
		gol.promocao = false;
		
		
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("SEM PROMO��O: ");
		System.out.println();
		System.out.println(palio);
		System.out.println(palioPrata);
		System.out.println(civic);
		System.out.println(corola);
		System.out.println(gol);
	
//		Segundo print:	
		//		Quest�o 1:
//		Carro.promocao = true;		
		
		//		Quest�o 2:		
		palio.promocao = true;
		palioPrata.promocao = true;
		civic.promocao = true;
		corola.promocao = true;
		gol.promocao = true;
		
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("COM PROMO��O: ");
		System.out.println();
		System.out.println(palio);
		System.out.println(palioPrata);
		System.out.println(civic);
		System.out.println(corola);
		System.out.println(gol);
		
		//		Quest�o 3:
//		Mudou a forma como chamamos a variavel promo��o, tornando ela individual em cada objeto.
//		Ao utilizar a promo��a como variavel de classe, teremos que colocar a loja toda em promo��o de uma s� vez.
//		Sendo ela uma variavel de objeto a gente pode escolher qual carro que sofrer� o desconto estipulado, 
//		sendo assim teremos que um Palio esta com 10% de desconto, mas o corola n�o, e vice-versa.
		
	}

}