package app;

public class Data {
	
	private short dia;
	private short mes;
	private short ano;
	private short hora;
	
	
	public Data(short dia, short mes, short ano, short hora) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.hora = hora;
	}


	public short getDia() {
		return dia;
	}


	public void setDia(short dia) {
		this.dia = dia;
	}


	public short getMes() {
		return mes;
	}


	public void setMes(short mes) {
		this.mes = mes;
	}


	public short getAno() {
		return ano;
	}


	public void setAno(short ano) {
		this.ano = ano;
	}


	public short getHora() {
		return hora;
	}


	public void setHora(short hora) {
		this.hora = hora;
	}

}
