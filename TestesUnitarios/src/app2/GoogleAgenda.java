package app2;

import java.util.ArrayList;
import java.util.List;

public class GoogleAgenda {
	
	private Reuniao[] reunioes;
	private int tamanho;
	
	public int getTamanhoReunioes() {
		return reunioes.length;
	}
	
	public GoogleAgenda() {
		this.reunioes = new Reuniao[10];
		this.tamanho = 0;
	}
	
	public void adicionarReuniao(Reuniao r) {
		//extrapolei o meu array reunioes?
		if(tamanho >= reunioes.length) {
			duplicaReunioes();
		}
		this.reunioes[tamanho] = r;
		tamanho++;
	}
	
	//como você tenta evitar duplicidade de código
	public void adicionarReuniao(Data dia, List<String> participantes) {
		adicionarReuniao(new Reuniao(dia, participantes));
	}
	
	public void duplicaReunioes() {
		Reuniao[] reuniaoAux = new Reuniao[2*tamanho];
		//for indexado
		for(int i = 0; i < tamanho; i++) {
			reuniaoAux[i] = this.reunioes[i];
		}
		this.reunioes = reuniaoAux;
	}
	
	public int getQuantidadeReunioes() {
		return tamanho;
	}
	
	public List<Reuniao> getReunioesDia(Data d){
		List<Reuniao> reunioesLista = new ArrayList<Reuniao>();
		//for-each
	
		for(Reuniao r : reunioes) {
			if(r.getData().getDia() == d.getDia() &&
			   r.getData().getMes() == d.getMes() &&	
			   r.getData().getAno() == d.getAno()) {
				reunioesLista.add(r);
			}
		}
		return reunioesLista;
	}

	public Reuniao getReuniaoMaisLonga() {
		Reuniao reuniaoMaisLonga = null;
		for(Reuniao r : reunioes) {
			if(reuniaoMaisLonga == null)
				reuniaoMaisLonga = r;
			else if(getDuracao(r) > getDuracao(reuniaoMaisLonga)){
				reuniaoMaisLonga = r;
			}
		}
		return reuniaoMaisLonga;
	}
	
	private short getDuracao(Reuniao r) {
		return (short) (r.getData().getHoraFim() - r.getData().getHoraInicio()); 
	}
	
	public void removerParticipante(String nome) {
		for(Reuniao r : reunioes) {
			if(r.getParticipantes().contains(nome)) {
				r.getParticipantes().remove(nome);
			}
		}
	}

}