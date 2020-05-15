package aplicativo;

import java.util.ArrayList;
import java.util.List;
import aplicativo.Corrida;

public class Uber{
	private ContaCorrente contaUber;
	private List<Corrida> corridasPendentes = new ArrayList<>();
	private List<Corrida> corridasAtivas = new ArrayList<>();
	private List<Motorista> motoristas = new ArrayList<>();
	private List<Passageiro> clientes = new ArrayList<>();
	private Passageiro novo;
	
		public List<Corrida> getCorridasPendentes() {
			return corridasPendentes;
		}
	
	
		public List<Corrida> getCorridasAtivas() {
			return corridasAtivas;
		}
		
		public void solicitaCorrida (Passageiro novo, String localInicio, String localFim, double km, String tipo, Uber uber) {
			this.novo = novo;
			
			if(tipo.equals("Pool")) {
				CorridaPool c = new CorridaPool(novo, localInicio, localFim, km, uber);
				this.corridasPendentes.add(c);
				mapeia(c);
				
				
			} else if (tipo.equals("Vip")) {
				CorridaVip c = new CorridaVip(novo, localInicio, localFim, km, uber);
				this.corridasPendentes.add(c);
				mapeia(c);

			}
			else {
				Corrida c = new Corrida(novo, localInicio, localFim, km, uber);
				this.corridasPendentes.add(c);
				mapeia(c);
			}
	}
		

		public Uber(ContaCorrente conta) {
		super();
		this.contaUber = conta;
	}

		public void cadastrar(Motorista novo) {
			if(!motoristas.contains(novo)) {
			this.motoristas.add(novo);
			System.out.printf("O motorista %s foi Cadastrado com sucesso!\n", novo.pessoaMotorista.getNome());
		}
			else {
				System.out.println("Esse motorista já se encontra cadastrado!");
			}
	}
	
		public void descadastrar(Motorista remover) {
			if (motoristas.contains(remover)) {
				this.motoristas.remove(remover);
			System.out.println("Removido com sucesso!");
		}
			else {
				System.out.println("Esse motorista não se encontra cadastrado!");
			}
	}
	
		public void cadastrarCliente(Passageiro novo) {
			if(!clientes.contains(novo)) {
				this.clientes.add(novo);
				System.out.printf("%s Cadastrado com sucesso!", novo.pessoaPassageiro.getNome());
			}
			else {
				System.out.println("Esse cliente já se encontra cadastrado");
			}
		}
		
		public void descadastrarCliente(Passageiro novo) {
			if(clientes.contains(novo)) {
				this.clientes.remove(novo);
				System.out.println("Descadastrado com sucesso!");
			}
			else {
				System.out.println("Esse cliente não se encontra cadastrado!");
			}
		}
		
		public void mapeia(Corrida c) {
			Motorista daVez = motoristas.get(0);
			double media = motoristas.get(0).lucros/motoristas.get(0).getCorridasMotorista().size();
			double media2 = motoristas.get(1).lucros/motoristas.get(1).getCorridasMotorista().size();
				for(int i = 0 ; i < motoristas.size()-1 ; i++) {
					media = motoristas.get(i).lucros/motoristas.get(i).getCorridasMotorista().size();
					media2 = motoristas.get(i+1).lucros/motoristas.get(i+1).getCorridasMotorista().size();
					if (media > media2) {
						daVez = motoristas.get(i);
					}
				}
				
				double valorTotal = c.getCusto();
				daVez.lucros += valorTotal * 0.6;
				daVez.pessoaMotorista.getConta().adicionarSaldo(valorTotal*0.6);
				contaUber.adicionarSaldo(valorTotal * 0.4);
				corridasPendentes.remove(c);
				corridasAtivas.add(c);
				daVez.corridasMotorista.add(c);
				novo.corridasPassageiro.add(c);
				novo.pessoaPassageiro.getConta().removerSaldo(valorTotal);
				String nomeP = novo.pessoaPassageiro.getNome();
				System.out.printf("\nO cliente %s pagará o valor de R$ %.2f", nomeP, valorTotal);
				}
		
}
