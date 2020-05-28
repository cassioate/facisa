package app7;

public class HoraInvalidaException extends Exception {
	public HoraInvalidaException() {
		super("A hora digitada é inválida\n");
	}
}
