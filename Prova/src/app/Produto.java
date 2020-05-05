package app;

public class Produto {
	
	private double preco;
	private String nome;
	private String vendedor;
	private Data dataAnuncio;
	
	public Produto(double preco, String nome, String vendedor, Data dataAnuncio) {
		this.preco = preco;
		this.nome = nome;
		this.vendedor = vendedor;
		this.dataAnuncio = dataAnuncio;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getVendedor() {
		return vendedor;
	}

	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	public Data getDataAnuncio() {
		return dataAnuncio;
	}

	public void setDataAnuncio(Data dataAnuncio) {
		this.dataAnuncio = dataAnuncio;
	}
	
	public String toString() {
		return nome
				+", "
				+preco
				+","
				+vendedor
				+", "
				+dataAnuncio;
		
	}
	
}
