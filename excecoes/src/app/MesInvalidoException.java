package app;

public class MesInvalidoException extends Exception{
	
	public MesInvalidoException(int mesEscolhido) {
		super("O número do mês deve estar contido no intervalo [1, 12]\n"
				+ "Mês escolhido: "+mesEscolhido);
	}
}
