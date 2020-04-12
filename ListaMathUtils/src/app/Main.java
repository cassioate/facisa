package app;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
//		1)-
		System.out.println(ListaMathUtils.calculaDivisores(12));
		System.out.println("------------------------------------");

		
//		2)-
		
		List <Double> valores = new ArrayList<Double>();
		valores.add(12.4);
		valores.add(43.1);
		valores.add(4.3);
		valores.add(54.0);
		valores.add(6.7);
		
		System.out.println(ListaMathUtils.computaMaior(valores));
		System.out.println("------------------------------------");
//		3)-
		System.out.println(ListaMathUtils.computaMenor(valores));
		System.out.println("------------------------------------");
//		4)-
		System.out.println(ListaMathUtils.computaMedia(valores));
		System.out.println("------------------------------------");
//		5)-
		System.out.println(ListaMathUtils.temNumRepetido(valores));
		System.out.println("------------------------------------");

}
}
