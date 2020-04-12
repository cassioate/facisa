package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaMathUtils {
	
	public static List<Integer> calculaDivisores (int num) {
		List<Integer>lista = new ArrayList<Integer>();
		for(int i = 1; i < num; i ++) {
			if (num % i == 0)
				lista.add(i);
		}
		return lista;
	}
	
	public static double computaMaior(List num) {
		double contador = (double) num.get(0) ;
			for (int i = 1; i < num.size(); i++) {
				if ((double)num.get(i) > (double)num.get(i-1) && (double)num.get(i) > contador) {
					contador = (double) num.get(i);
				}
			}
			return contador;	
	}
	
	public static double computaMenor(List num) {
		double contador = (double) num.get(0) ;
			for (int i = 1; i < num.size(); i++) {
				if ((double)num.get(i) < (double)num.get(i-1) && (double)num.get(i) < contador) {
					contador = (double) num.get(i);
				}
			}
			return contador;
	}
	
	public static double computaMedia(List num) {
		double total = 0;
			for (int i = 0; i < num.size(); i++) {
				total += (double)num.get(i);
				}
			double media = total/num.size();
			return media;
	}
	
	public static boolean temNumRepetido(List num) {
		boolean valor = false;
		for (int i = 0; i < num.size(); i ++) {
			for (int j = i + 1; j < num.size(); j ++) {
				if(((double)num.get(i)) == ((double)num.get(j))) {
					valor = true;
				}
			}
		}
		return valor;
	}	
}
