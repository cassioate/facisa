package app;

public class ValorInvalidoException extends Exception {
	
	public ValorInvalidoException(double valor) {
		super("Valor invalido, voc� tentou depositar: " +valor);
	}

}
