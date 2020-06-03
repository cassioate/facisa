package app2;

public class Data {
	
	private short dia, mes, ano, horaInicio, horaFim;

	public Data(short dia, short mes, short ano, short horaInicio, short horaFim) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
	}
	
	public short getDia() {
		return dia;
	}
	
	public short getMes() {
		return mes;
	}
	
	public short getAno() {
		return ano;
	}
	
	public short getHoraInicio() {
		return horaInicio;
	}
	
	public short getHoraFim() {
		return horaFim;
	}
	
}