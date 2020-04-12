package app;

import java.util.ArrayList;
import java.util.List;

public class LojaDeCarros {
	
	public static List<Carro> disponiveis = new ArrayList<Carro>();
	public static List<Carro> vendidos = new ArrayList<Carro>();
	
	public static void adicionarCarro(Carro carro) {
		disponiveis.add(carro);
	}
	public static void exibirCarrosDisponiveis() {
		System.out.println("Carros disponiveis no momento: \n"+disponiveis);
	}
	public static int venderCarro(int id) {
		for(int i = 0; i < disponiveis.size(); i ++) {
			if (disponiveis.get(i).id == id) {
				vendidos.add(disponiveis.get(i));
				disponiveis.remove(i);
			}
		}
		return id;
	}
	public static void adicionarPromocao(int id) {
		for(int i = 0; i < disponiveis.size(); i ++) {
			if (disponiveis.get(i).id == id) {
				double aux = disponiveis.get(i).precoBase;
				disponiveis.get(i).precoBase = (aux) - (aux * 15 / 100);
			}
		}
	}
	public static int computaApuradoDasVendas() {
		int output = 0;
		for(int i = 0; i < vendidos.size(); i ++) {
			output += vendidos.get(i).calculaPreco();
		}
		return output;
	}
	public static void limparVendidos() {
		vendidos.clear();	
	}
}