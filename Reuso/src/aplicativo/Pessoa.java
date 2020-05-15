package aplicativo;

public class Pessoa {
	private String cpf;
	private String nome;
	private Data dataIngresso;
	protected ContaCorrente conta;

	public Pessoa (String cpf, String nome, Data dataIngresso, ContaCorrente conta) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.dataIngresso = dataIngresso;
		this.conta = conta;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}

	public Data getDataIngresso() {
		return dataIngresso;
	}

	public ContaCorrente getConta() {
		return conta;
	}

}
