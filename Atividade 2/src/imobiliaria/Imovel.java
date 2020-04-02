package imobiliaria;

public class Imovel {

	String tipo, imobiliaria;
	int pavimentos, pavimento, quartos, suites, banheiros, metrosQuadrados;
	boolean elevador, piscina, quadra;
	
	
	public Imovel(String tipo, String imobiliaria, int quartos, int suites, int banheiros, int metrosQuadrados,
			boolean piscina, boolean quadra) {
		super();
		this.tipo = tipo;
		this.imobiliaria = imobiliaria;
		this.quartos = quartos;
		this.suites = suites;
		this.banheiros = banheiros;
		this.metrosQuadrados = metrosQuadrados;
		this.piscina = piscina;
		this.quadra = quadra;
	}


	public Imovel(String tipo, String imobiliaria, int pavimentos, int pavimento, int quartos, int suites, int banheiros,
			int metrosQuadrados, boolean elevador, boolean piscina, boolean quadra) {
		super();
		this.tipo = tipo;
		this.imobiliaria = imobiliaria;
		this.pavimentos = pavimentos;
		this.pavimento = pavimento;
		this.quartos = quartos;
		this.suites = suites;
		this.banheiros = banheiros;
		this.metrosQuadrados = metrosQuadrados;
		this.elevador = elevador;
		this.piscina = piscina;
		this.quadra = quadra;
		
	}
	
	public double calculaPreco() {
		double precoTotal = 5000*metrosQuadrados;
		
		if (pavimento>5)
			precoTotal += (pavimento-5)*2000;
		
		if (elevador)
			precoTotal += 2500;
		
		if (piscina)
			precoTotal += 2500;
		
		if (quadra)
			precoTotal += 2500;
		
		return precoTotal;
				
	}
	
	public String toString() {
		String output = "Tipo: "+this.tipo+"\n";
		output += "Imobiliaria: "+this.imobiliaria+"\n";
		output += "Pavimentos: "+this.pavimentos+"\n";
		output += "Pavimento: "+this.pavimento+"\n";
		output += "Quartos: "+this.quartos+"\n";
		output += "Suites: "+this.suites+"\n";
		output += "Banheiros: "+this.banheiros+"\n";
		output += "Metros Quadrados: "+this.metrosQuadrados+"\n";
		output += "Elevador: "+this.elevador+"\n";
		output += "Piscina: "+this.piscina+"\n";
		output += "Quadra: "+this.quadra+"\n";
		output += "Preço Total: R$ "+String.format("%.2f", this.calculaPreco())+"\n";
		return output;
		
	}
	
}

