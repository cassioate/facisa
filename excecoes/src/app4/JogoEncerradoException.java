package app4;

public class JogoEncerradoException extends RuntimeException{
	
	public JogoEncerradoException() {
		super("Não é permitido tentar mais palpites, o jogo está encerrado");
	}

}
