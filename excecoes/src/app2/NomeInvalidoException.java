package app2;

public class NomeInvalidoException extends Exception{
	public NomeInvalidoException(String nome) {
		super("O nome fornecido n�o pode ser nulo ou vazio\n"
				+ "O nome digitado foi: " +nome);
	}
}
