package app2;

import java.util.List;

public class Reuniao {
	
	private List<String> participantes;
	private Data data;
	
	public Reuniao(Data data, List<String> participantes) {
		this.data = data;
		this.participantes = participantes;
	}
	
	public Data getData() {
		return data;
	}
	
	public void setData(Data data) {
		this.data = data;
	}
	
	public List<String> getParticipantes() {
		return participantes;
	}
	
	@Override
	public String toString() {
		String output = "";
		output += "Dia: "+data.getDia()+"/"+data.getMes()+"/"+data.getAno()+"\n";
		output += "Horário: "+data.getHoraInicio()+" até "+data.getHoraFim()+"\n";
		output += "Participantes: \n";
		for(String participante : participantes) {
			output += participante+"\n";
		}
		return output;
	}
	

}