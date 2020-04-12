package app;

import java.util.ArrayList;
import java.util.List;

public class SistemaInterpol {
	
	public List<String> procurados = new ArrayList<String>();
	
	public void adiciona(String nomes) {
		procurados.add(nomes);
	}
	public boolean Procurado(String nomes) {
		boolean estaNaLista = false;
		for (int i = 0; i < procurados.size(); i ++) {
			if (procurados.get(i).contains(nomes)) {
				estaNaLista = true;
		}
		}
		return estaNaLista;
}
}