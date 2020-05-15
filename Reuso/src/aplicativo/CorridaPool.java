package aplicativo;

public class CorridaPool extends Corrida {
	
	public CorridaPool(Passageiro p, String localInicio, String localFim, double km, Uber uber)  {
		super(p, localInicio, localFim, km, uber);
	}

	protected double getPrecoBase() {
		double preco = 4.5;
		return preco;
	}
	
	protected double getCustoKm() {
		double custo = 1.3;
		return custo;
	}
	
	public double getCusto() {
		double custo = getPrecoBase() + getCustoKm() * km;
		double valor = (passageiros.size()*10)/100 + custo;
		if(uber.getCorridasAtivas().size()>=50) {
			double valorFinal = valor+(valor*10)/100;
			return valorFinal;
		}
			else {
				return valor;
			}
	}
}