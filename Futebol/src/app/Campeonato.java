package app;

public class Campeonato {
	
	public String[] times;
	
	public void adicionarTimes(String times) {
		this.times = times.split(" ");
	}
		
	public String [] criarCampeonato() {
		int tamanho = (times.length - 1) * 2;
		String partidas = "";
		String[] tabela = new String[tamanho];
		int quantidade = 0;
		for (int i = 0; i < times.length; i ++) {
			for (int j = i+1; j < times.length; j ++) {
				partidas = times[i] + " x " + times[j] + "\n";
				tabela[quantidade] = partidas;
				quantidade += 1;
				}	
			}
		return tabela;

	}
	
	public String printArray(String[] valor) {
		String resultado= "|";
		int contador = 0;
		while (contador < (valor.length)) {
			if (contador == (valor.length-1)) {
				resultado += valor[contador] + "";
			}
			else {
				resultado += valor[contador] + "|";
			}
			contador += 1;
		}
		return resultado;
	}
}
