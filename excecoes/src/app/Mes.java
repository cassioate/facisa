package app;

public class Mes {
	private int numero;

	public Mes(int numero) throws MesInvalidoException {
		if (numero < 1 || numero > 12) {
			throw new MesInvalidoException(numero);
		} else {
			this.numero = numero;
		}
	}

	public String getNome() {
		String nome = null;
		switch (numero) {
		case 1:
			nome = "janeiro";
			break;
		case 2:
			nome = "fevereiro";
			break;
		case 3:
			nome = "março";
			break;
		case 4:
			nome = "abril";
			break;
		case 5:
			nome = "maio";
			break;
		case 6:
			nome = "junho";
			break;
		case 7:
			nome = "julho";
			break;
		case 8:
			nome = "agosto";
			break;
		case 9:
			nome = "setembro";
			break;
		case 10:
			nome = "outubro";
			break;
		case 11:
			nome = "novembro";
			break;
		case 12:
			nome = "dezembro";
			break;
		}
		return nome;
	}
}
