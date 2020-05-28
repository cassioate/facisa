package app5;

public class NotaInvalidaException extends Exception{
		
		public NotaInvalidaException() {
			super("A nota deve estar no intervalo entre 0,0 e 10,0\n");
		}

	}
