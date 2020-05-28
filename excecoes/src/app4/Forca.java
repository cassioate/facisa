package app4;

public class Forca {
	private static final int QTD_MAX_ERROS = 6;
	private char[] letrasSecretas;
	private char[] letrasPalpites;
	private char[] letrasUsadas;
	private int erros;
	private int acertos;
	private int contador;

	public char[] getPalpites() {
		return this.letrasPalpites;
	}

	public int getQtdErros() {
		return this.erros;
	}

	public boolean getGanhou() {
		return this.acertos == letrasSecretas.length;
	}

	public boolean getPerdeu() {
		return this.erros == QTD_MAX_ERROS;
	}

	public boolean getAcabou() {
		return this.getGanhou() || this.getPerdeu();
	}

	public Forca(String palavraSecreta) {
		this.letrasSecretas = palavraSecreta.toUpperCase().toCharArray();
		this.letrasPalpites = new char[letrasSecretas.length];
		this.letrasUsadas = new char[26];
		for (int i = 0; i < letrasSecretas.length; i++) {
			letrasPalpites[i] = '_';
		}
		this.erros = 0;
	}

	public void tentarPalpite(char letra){
		boolean acertou = false;
		boolean jaExiste = false;
		
		if(!getAcabou()) {
			
			for ( int i = 0; i <= 25; i++) {
				if(letrasUsadas[i] == letra) {
					jaExiste = true;
				} 
			}
			
			if(jaExiste == true) {
				System.out.printf("A letra %s ja foi utilizada. Essa rodada não será contabilizada!\n", letra);
				this.erros--;
				
			} else {
				letrasUsadas[contador] += letra;
				contador+=1;
				for (int i = 0; i < this.letrasSecretas.length; i++) {
					char letraSecreta = this.letrasSecretas[i];	
					if (letraSecreta == letra) {
							this.letrasPalpites[i] = letraSecreta;
							this.acertos++;
							acertou = true;
							
						}		
					}
				}		
	
		if (!acertou) {
			this.erros++;
			}
		}
	}
}
		
