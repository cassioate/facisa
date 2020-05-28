package app3;

public class DataInvalidaException extends Exception{
	public DataInvalidaException(){
		super("Os parâmetros fornecidos não representam uma data válida\n");
	}
}
