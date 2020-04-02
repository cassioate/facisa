package imobiliaria;

public class Classificados {

	public static void main(String[] args) {
		
		Imovel casa1 = new Imovel("Casa", "Imobiliaria Falcão", 3, 1, 2, 120, true, true);
		Imovel ap1 = new Imovel("Apartamento", "Imobiliaria Falcão", 15, 8, 3, 2, 3, 82, true, false, false);
		Imovel casa2 = new Imovel("Casa", "Imobiliaria Altaman", 4, 2, 3, 240, true, true);
		Imovel casa3 = new Imovel("Casa", "Imobiliaria Leblon", 6, 3, 5, 540, true, true);
		Imovel ap2 = new Imovel("Apartamento", "Imobiliaria Alto Branco", 3, 2, 2, 1, 2, 60, false, false, false);
		
		System.out.println(casa1);
		System.out.println(ap1);
		System.out.println(casa2);
		System.out.println(casa3);
		System.out.println(ap2);
		
	}

}
