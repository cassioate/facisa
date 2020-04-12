package app;

public class Carro {
	int id;
	String nome;
	String marca;
	String cor;
	int portas;
	boolean vidroEletrico, arCondicionado, cambioAutomatico, direcaoEletrica;
	double precoBase;
//	-	
	public Carro(int id, String nome, String marca, double precoBase) {
		this.id = id;
		this.nome = nome;
		this.marca = marca;
		this.precoBase = precoBase;
		this.cor = "BRANCO";
		this.portas = 2;
		this.vidroEletrico = false;
		this.arCondicionado = false;
		this.cambioAutomatico = false;
		this.direcaoEletrica = false;
	}
	
	public Carro(int id, String nome, String marca, String cor, int portas, boolean vidroEletrico, boolean arCondicionado,
			boolean cambioAutomatico, boolean direcaoEletrica, double precoBase) {
		this.id = id;
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
		this.portas = portas;
		this.vidroEletrico = vidroEletrico;
		this.arCondicionado = arCondicionado;
		this.cambioAutomatico = cambioAutomatico;
		this.direcaoEletrica = direcaoEletrica;
		this.precoBase = precoBase;
	}
	
	public Carro() {}
	
	public double calculaPreco() {
		double precoTotal = precoBase;
		
		switch(cor) {
		case "BRANCO":
			precoTotal += 0;
			break;
		case "AZUL":
			precoTotal += 0;
			break;
		case "VERMELHO":
			precoTotal += 0;
			break;
		case "PRETO":
			precoTotal += 0;
			break;
		default:
			precoTotal += 1000;
			break;
		}
		
		if(vidroEletrico)
			precoTotal += 1250;
		if(arCondicionado)
			precoTotal += 1250;
		if(cambioAutomatico)
			precoTotal += 1250;
		if(direcaoEletrica)
			precoTotal += 1250;
		
		return precoTotal;
	}
	
	public String toString() {
		String output = "ID: "+this.id+"\n";
		output += "Nome: "+this.nome+"\n";
		output += "Marca: "+this.marca+"\n";
		output += "Cor: "+this.cor+"\n";
		output += "Portas: "+this.portas+"\n";
		output += "Vidro eletrico: "+this.vidroEletrico+"\n";
		output += "Ar condicionado: "+this.arCondicionado+"\n";
		output += "Câmbio automatico: "+this.cambioAutomatico+"\n";
		output += "Direção Eletrica: "+this.direcaoEletrica+"\n";
		output += "Preço Base: "+this.precoBase+"\n";
		output += "Preço Total: "+this.calculaPreco()+"\n";
		return output;
	}
}
