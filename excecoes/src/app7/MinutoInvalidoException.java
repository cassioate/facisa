package app7;

public class MinutoInvalidoException extends Exception{
	public MinutoInvalidoException() {
		super("O minuto digitado é inválido\n");
	}
}
