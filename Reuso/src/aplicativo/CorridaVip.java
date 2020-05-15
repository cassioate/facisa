package aplicativo;

public class CorridaVip extends Corrida {
	
		public CorridaVip(Passageiro p, String localInicio, String localFim, double km, Uber uber)  {
		super(p, localInicio, localFim, km, uber);

	}

		protected double getCustoKm() {
			double custo =  2.3;
			return custo;
	}
}
