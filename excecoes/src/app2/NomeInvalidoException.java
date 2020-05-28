package app2;

public class NomeInvalidoException extends Exception{
	public NomeInvalidoException(String nome) {
		super("O nome fornecido não pode ser nulo ou vazio\n"
				+ "O nome digitado foi: " +nome);
	}
}
