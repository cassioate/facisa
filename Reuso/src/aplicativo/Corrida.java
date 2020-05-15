package aplicativo;

import java.util.ArrayList;
import java.util.List;

public class Corrida{
	private Data inicioCorrida;
	private Data fimCorrida;
	protected String localInicio;
	protected String localFim;
	protected double km;
	protected List<Passageiro> passageiros = new ArrayList<>();
	protected Uber uber;
	
	public Data getInicioCorrida() {
		return inicioCorrida;
	}
	public Data getFimCorrida() {
		return fimCorrida;
	}
	public double getKm() {
		return km;
	}

	
	public Corrida(Passageiro p, String localInicio, String localFim, double km, Uber uber) {
		passageiros.add(p);
		this.localInicio = localInicio;
		this.localFim = localFim;
		this.km = km;
		this.uber = uber;
	}

	public double getCusto() {
		double valor = getPrecoBase() + (getCustoKm() * km);
			if(uber.getCorridasAtivas().size()>=2) {
			double valorFinal = valor+(valor*10)/100;
			return valorFinal;

			} 
			else {
				return valor;
			}
	}
	protected double getPrecoBase() {
		double preco = 5;
		return preco;
	}
	
	protected double getCustoKm() {
		double custo =  1.6;
		return custo;
	}
	
}