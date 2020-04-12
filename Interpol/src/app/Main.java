package app;

public class Main {

	public static void main(String[] args) {
		
		
		SistemaInterpol busca = new SistemaInterpol();
		
		busca.adiciona("Carlos");
		busca.adiciona("Jose");
		busca.adiciona("Joao");
		
		System.out.println("Ele está na lista?");
		System.out.println(busca.Procurado("Carlos"));
		System.out.println("------------------------------------");
		System.out.println("Ele está na lista?");
		System.out.println(busca.Procurado("Kleysikeynison"));
		System.out.println("------------------------------------");
		System.out.println("Ele está na lista?");
		System.out.println(busca.Procurado("Joao"));
		System.out.println("------------------------------------");

	}

}
