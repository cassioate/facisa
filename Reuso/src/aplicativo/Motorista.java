package aplicativo;

import java.util.ArrayList;
import java.util.List;

public class Motorista {
	protected Pessoa pessoaMotorista;
	protected Data ingresso;
	protected List<Corrida> corridasMotorista = new ArrayList<>();
	protected double lucros;
	
	public Motorista(Pessoa pessoaMotorista, Data ingresso) {
		this.pessoaMotorista = pessoaMotorista;
		this.ingresso = ingresso;
	}

	public Pessoa getPessoaMotorista() {
		return pessoaMotorista;
	}
	public Data getIngresso() {
		return ingresso;
	}
	public List<Corrida> getCorridasMotorista() {
		return corridasMotorista;
	} 
}
