package app;

public class Main {

	public static void main(String[] args) {

		Campeonato times = new Campeonato();
		times.adicionarTimes("Inter Gremio Juventude Caxias");
		System.out.println(times.printArray(times.criarCampeonato()));
		
	}

}