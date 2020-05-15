package aplicativo;

import Exception.SaldoInferior;
import Exception.SenhaInvalidaException;
import Exception.ValorInvalido;

public class ContaCorrente {
	
	private String Nome;
	private String cpfOrCnpj;
	private String senha;
	private double saldo;
	
	public ContaCorrente(String nome, String cpfOrCnpj, String senha, double saldo) {
		super();
		this.Nome = nome;
		this.cpfOrCnpj = cpfOrCnpj;
		this.senha = senha;
		this.saldo = saldo;
	}


	public String getNome() {
		return Nome;
	}
	public String getCpfOrCpnj() {
		return cpfOrCnpj;
	}
	public String getSenha() {
		return senha;
	}
	public double getSaldo() {
		return saldo;
	}
	
	@Override
	public String toString() {
		return "ContaCorrente: "
					+"\nNome = " 
					+ Nome 
					+ "\nCPF ou CNPJ = " 
					+ cpfOrCnpj 
					+ "\nSaldo = " 
					+ String.format("R$ %.2f", saldo)
					+"\n";
	}
	
	public void transferir(double valor, String senha, ContaCorrente conta) throws SenhaInvalidaException, SaldoInferior, ValorInvalido {
		
		if(!this.senha.equals(senha)) {
			throw new SenhaInvalidaException("Senha invalida, tente novamente!");
		}
		if(this.saldo < valor) {
			throw new SaldoInferior("O saldo desta conta é inferior ao valor solicitado!\n Saldo da conta: "+this.saldo);
		}
		if(valor <= 0) {
			throw new ValorInvalido("Você não digitou um valor valido, tente novamente");
		}
		
			this.saldo = this.saldo-valor;
			conta.saldo += valor;
	}
	
	public void adicionarSaldo(double valor) {
		this.saldo += valor;
	}
	
	public void removerSaldo(double valor) {
		this.saldo -= valor;
	}
//	
//	public static void main(String[] args) throws SenhaInvalidaException, SaldoInferior, ValorInvalido {
//		ContaCorrente contaCassio = new ContaCorrente("Cassio", "527.873.972-04", "123", 500);
//		ContaCorrente contaEduardo = new ContaCorrente("Eduardo", "015.456.329-05", "123456", 100000);
//		
//		try {
//		contaEduardo.transferir(1000, "123456", contaCassio);
//		} catch (SenhaInvalidaException | SaldoInferior | ValorInvalido e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println(contaCassio);
//		System.out.println(contaEduardo);
//	}
//	
}
	
