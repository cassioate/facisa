package app;

public class SistemaInterpol {
	
	public String[] procurados;
	
	public void adiciona(String nomes) {
		procurados = nomes.split(" ");
	}
	public boolean Procurado(String nome) {
		boolean estaNaLista = false;
		for (int i = 0; i < procurados.length; i ++) {
			if (procurados[i].equals(nome)) {
				estaNaLista = true;
		}
		}
		return estaNaLista;
}
}