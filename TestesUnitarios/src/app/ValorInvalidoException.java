package app;

public class ValorInvalidoException extends Exception {
	
	public ValorInvalidoException(double valor) {
		super("Valor invalido, você tentou depositar: " +valor);
	}

}
