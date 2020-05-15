package aplicativo;

import java.util.ArrayList;
import java.util.List;

public class Passageiro {
	protected Pessoa pessoaPassageiro;
	protected Data ingresso;
	protected List<Corrida> corridasPassageiro = new ArrayList<>();
	
	public Passageiro(Pessoa pessoaPassageiro, Data ingresso) {
		super();
		this.pessoaPassageiro = pessoaPassageiro;
		this.ingresso = ingresso;
	}

	public int pegaTamanhoListaPassageiro(){
	int tamnhoCorridasPassageiro = corridasPassageiro.size();
	return tamnhoCorridasPassageiro;
	}
	
	public Pessoa getPessoaPassageiro() {
		return pessoaPassageiro;
	}
	public Data getIngresso() {
		return ingresso;
	}
	public List<Corrida> getCorridas() {
		return corridasPassageiro;
	} 
		
}