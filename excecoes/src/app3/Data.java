package app3;

import java.util.Date;
import java.util.GregorianCalendar;

public class Data {
	public static final long MILISECONDS_PER_DAY = 60 * 60 * 24 * 1000;
	private int dia;
	private int mes;
	private int ano;

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public long getQuantidadeDeDias() throws DataInvalidaException {
		if(temTrintaDias(mes) && isBissexto(ano)) {
			Date data = new Date(new GregorianCalendar(ano, mes - 1, dia).getTimeInMillis());
			Date agora = new Date();
			return (data.getTime() - agora.getTime()) / MILISECONDS_PER_DAY;
		}
		else {
			throw new DataInvalidaException();
		}
	}

	private boolean isBissexto(int ano) {
		return (ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0));
	}
	
	private boolean temTrintaDias(int mes) {
		return mes == 4 || mes == 6 || mes == 9 || mes == 11;
	}
}