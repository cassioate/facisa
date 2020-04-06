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
		
		palio.promocao = true;
		palioPrata.promocao = true;
		civic.promocao = true;
		corola.promocao = true;
		gol.promocao = true;
				
		System.out.println(palio);
		System.out.println(palioPrata);
		System.out.println(civic);
		System.out.println(corola);
		System.out.println(gol);
	
	}

}