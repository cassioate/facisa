package app;

import app.Carro;
public class Loja {

	public static void main(String[] args) {
		
		Carro palio = new Carro(10, "Palio", "Fiat", 35000);
		Carro palioPrata = new Carro(11, "Palio", "Fiat", "PRATA", 2, false, false, false, false, 35000);
		Carro civic = new Carro(12, "Civic", "Honda", "BRANCO", 4, true, true, true, true, 110000);
		Carro corola = new Carro(13, "Corolla", "Toyota", "BRANCO", 4, true, true, false, true, 110000);
		Carro gol = new Carro();
		gol.id = 14;
		gol.nome = "Gol";
		gol.marca = "Volkswagen";
		gol.cor = "BRANCO";
		gol.portas = 2;
		gol.vidroEletrico = false;
		gol.arCondicionado = false;
		gol.cambioAutomatico = false;
		gol.direcaoEletrica = false;
		gol.precoBase = 55000;
		LojaDeCarros.adicionarCarro(palio);
		LojaDeCarros.adicionarCarro(palioPrata);
		LojaDeCarros.adicionarCarro(civic);
		LojaDeCarros.adicionarCarro(corola);
		LojaDeCarros.adicionarCarro(gol);
		
		System.out.println("---------------------------------------------------------------");
		LojaDeCarros.exibirCarrosDisponiveis();
		System.out.println("---------------------------------------------------------------");
		LojaDeCarros.venderCarro(14);
		System.out.println("Venda Realizada!");
		System.out.println("-------------------");
		LojaDeCarros.exibirCarrosDisponiveis();
		System.out.println("---------------------------------------------------------------");
		System.out.println(LojaDeCarros.vendidos);
		System.out.println("---------------------------------------------------------------");
		LojaDeCarros.adicionarPromocao(10);
		System.out.println("Desconto aplicado!");
		System.out.println("-------------------");		
		LojaDeCarros.exibirCarrosDisponiveis();
		System.out.println("---------------------------------------------------------------");
		System.out.println("Apurado: R$ "+LojaDeCarros.computaApuradoDasVendas());
		System.out.println("---------------------------------------------------------------");
		System.out.println("Vendidos: \n"+LojaDeCarros.vendidos);
		System.out.println("---------------------------------------------------------------");
		LojaDeCarros.limparVendidos();
		System.out.println("Lista de vendas após limpar: \n"+ LojaDeCarros.vendidos);
		System.out.println("---------------------------------------------------------------");
		
		
	
	}

}
