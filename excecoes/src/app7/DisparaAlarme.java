package app7;

import java.util.Scanner;

public class DisparaAlarme {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a hora do alarme: ");
		int hora = teclado.nextInt();
		System.out.print("Digite o minuto do alarme: ");
		int minuto = teclado.nextInt();
		Alarme alarme;
		try {
			alarme = new Alarme(hora, minuto);
			while (!alarme.isAgora()) {
				System.out.print(".");
				Thread.sleep(1000);
			} 
			System.out.println();
			System.out.println("Alarme disparado");
		} catch (HoraInvalidaException e) {
			System.out.println(e.getMessage());
		} catch (MinutoInvalidoException e) {
			System.out.println(e.getMessage());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		teclado.close();

	}
}