package app;


public class Main {

	public static void main(String[] args) {
		
		SistemaInterpol lista = new SistemaInterpol();
		lista.adiciona("Carlos Jose Joao");
		System.out.println("------------------------------------");
		System.out.println(lista.Procurado("Carlito"));
		System.out.println("------------------------------------");
		System.out.println(lista.Procurado("Kleysikeynison"));
		System.out.println("------------------------------------");
		System.out.println(lista.Procurado("Jose"));
		System.out.println("------------------------------------");
		
		}
}