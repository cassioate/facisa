package aplicativo;

public class Main {

	public static void main(String[] args) {
		
		ContaCorrente contaUber = new ContaCorrente ("Uber", "17.895.646/0001-87", "1234", 100000000);		
		ContaCorrente contaCassio = new ContaCorrente("Cassio", "527.873.972-04", "123", 500);
		ContaCorrente contaEduardo = new ContaCorrente("Eduardo", "015.456.329-05", "123456", 100000);
		ContaCorrente contaCarla = new ContaCorrente("Carla", "527.873.972-04", "123", 500);
		ContaCorrente contaRodrigo = new ContaCorrente("Rodrigo", "015.456.329-05", "123456", 100000);
		ContaCorrente contaJose = new ContaCorrente("Cassio", "527.873.972-04", "123", 500);
		ContaCorrente contaMaria = new ContaCorrente("Maria", "015.456.329-05", "123456", 100000);
		ContaCorrente contaFabio = new ContaCorrente("Fabio", "015.456.329-05", "123456", 100000);
		ContaCorrente contaClaudio = new ContaCorrente("Claudio", "015.456.329-05", "123456", 100000);

		Uber uber = new Uber(contaUber);

		Pessoa Cassio = new Pessoa("527.873.972-04", "Cássio" , new Data (02, 5, 2021, 10, 10), contaCassio);
		Pessoa Eduardo = new Pessoa("927.873.972-05", "Eduardo" , new Data (02, 5, 2021, 10, 10), contaEduardo);
		Pessoa Carla = new Pessoa("227.873.972-06", "Carla" , new Data (02, 5, 2021, 10, 10), contaCarla);
		Pessoa Rodrigo = new Pessoa("327.873.972-07", "Rodrigo" , new Data (02, 5, 2021, 10, 10), contaRodrigo);
		Pessoa Jose = new Pessoa("627.873.972-08", "Jose" , new Data (02, 5, 2021, 10, 10), contaJose);
		Pessoa Maria = new Pessoa("827.873.972-09", "Maria" , new Data (02, 5, 2021, 10, 10), contaMaria);
		Pessoa Fabio = new Pessoa("907.873.972-09", "Fabio" , new Data (02, 5, 2021, 10, 10), contaFabio);
		Pessoa Claudio = new Pessoa("111.873.972-09", "Claudio" , new Data (02, 5, 2021, 10, 10), contaClaudio);
		
		Motorista MotoristaCassio = new Motorista(Cassio, new Data(05, 5, 2021, 11, 12));
		Motorista MotoristaEduardo = new Motorista(Eduardo, new Data (05, 5, 2023, 11, 11));
		Motorista MotoristaCarla = new Motorista(Carla, new Data (05, 5, 2023, 11, 11));
		Motorista MotoristaRodrigo = new Motorista(Rodrigo, new Data (05, 5, 2023, 11, 11));
		Passageiro passageiroJose = new Passageiro(Jose, new Data (05, 5, 2023, 11, 11));
		Passageiro passageiroMaria = new Passageiro(Maria, new Data (05, 5, 2023, 11, 11));
		Passageiro passageiroFabio = new Passageiro(Fabio, new Data (05, 5, 2023, 11, 11));
		Passageiro passageiroClaudio = new Passageiro(Claudio, new Data (05, 5, 2023, 11, 11));
		
		uber.cadastrar(MotoristaCassio);
		uber.cadastrar(MotoristaEduardo);
		uber.cadastrar(MotoristaCarla);
		uber.cadastrar(MotoristaRodrigo);
		uber.solicitaCorrida(passageiroJose, "Catole", "liberdade", 3, "Pool", uber);
		uber.solicitaCorrida(passageiroMaria, "Catole", "liberdade", 3, "Pool", uber);
		uber.solicitaCorrida(passageiroFabio, "Catole", "liberdade", 3, "Vip", uber);
		uber.solicitaCorrida(passageiroClaudio, "Catole", "liberdade", 3, "Vip", uber);

	}

}
