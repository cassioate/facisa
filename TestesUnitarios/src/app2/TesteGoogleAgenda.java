package app2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class TesteGoogleAgenda {
	
	private Reuniao a;
	private Reuniao b;
	private Reuniao c;
	private Reuniao d;
	private GoogleAgenda google;

	
	@Before
	public void setUp() {
		google = new GoogleAgenda();
		a = new Reuniao (new Data ((short) 10, (short) 11, (short) 2020, (short) 12, (short) 13), new ArrayList <String> (Arrays.asList ("C�ssio", "Jos�")));
		b = new Reuniao (new Data ((short) 9, (short) 11, (short) 2020, (short) 12, (short) 15), new ArrayList <String> (Arrays.asList ("C�ssio", "Jos�")));
		c = new Reuniao (new Data ((short) 11, (short) 11, (short) 2020, (short) 12, (short) 16), new ArrayList <String> (Arrays.asList ("C�ssio", "Jos�")));
		d = new Reuniao (new Data ((short) 12, (short) 11, (short) 2020, (short) 12, (short) 17), new ArrayList <String> (Arrays.asList ("C�ssio", "Jos�")));

	}

	@Test
	public void testToStringReuniao() {
//		Dia: 10
//		Hor�rio: 12:00
//		Participantes: 
//		C�ssio
//		Jos�

		String output = "Dia: 10/11/2020\n";
		output += "Hor�rio: 12 at� 13\n";
		output += "Participantes: \nC�ssio\nJos�\n";
		assertEquals(a.toString(), output);
	}
	
	@Test
	public void testAdicionaReuniao() {
		google.adicionarReuniao(a);
		assertEquals(1, google.getQuantidadeReunioes());
		google.adicionarReuniao(b);
		google.adicionarReuniao(c);
		google.adicionarReuniao(d);
		google.adicionarReuniao(b);
		google.adicionarReuniao(c);
		google.adicionarReuniao(d);
		google.adicionarReuniao(b);
		google.adicionarReuniao(c);
		google.adicionarReuniao(d);
		assertEquals(10, google.getQuantidadeReunioes());
		google.adicionarReuniao(d);
//		Adicionei um getTamanhoReunioes para verifciar se est� funcionando o if ao dobrar a quantidade de reunioes
		assertEquals(20, google.getTamanhoReunioes());
		assertEquals(11, google.getQuantidadeReunioes());
		google.adicionarReuniao(d);
		google.adicionarReuniao(d);
		google.adicionarReuniao(d);
		assertEquals(14, google.getQuantidadeReunioes());
		google.adicionarReuniao(a);
		google.adicionarReuniao(b);
		google.adicionarReuniao(c);
		google.adicionarReuniao(d);
		google.adicionarReuniao(b);
		google.adicionarReuniao(c);
		google.adicionarReuniao(d);
		google.adicionarReuniao(b);
		google.adicionarReuniao(c);
		google.adicionarReuniao(d);
		assertEquals(24, google.getQuantidadeReunioes());
//		Se Adicionar um getTamanhoReunioes para verifciar se est� funcionando o if ao dobrar a quantidade de reunioes
		assertEquals(40, google.getTamanhoReunioes());
	}

	@Test
	public void testDuplica(){
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		assertEquals(10, google.getTamanhoReunioes());
		google.adicionarReuniao(a);
		assertEquals(20, google.getTamanhoReunioes());
	}
	
	@Test
	public void testGetReunioesDia() {
//		Assim ele n�o funciona
//		google.adicionarReuniao(a);
//		google.getReunioesDia(new Data ((short) 10, (short) 11, (short) 2020, (short) 12, (short) 13));
//		OBS: Se existir menos que 10 reuni�es a fun��o ir� quebrar, pois tentar� dar um .getData em uma reuni�o inexistente e bugar�.
//		Para corrigir isso, teria que ser utilizado for(int i = 0; i < tamanho ; i++)
	
//		Assim ele funciona, mas voltar� a ter problemas quando for entre 11 e 19 reunioes...
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		google.adicionarReuniao(c);
		google.adicionarReuniao(d);
		google.adicionarReuniao(a);
		google.adicionarReuniao(b);
		google.adicionarReuniao(c);
		google.adicionarReuniao(d);
		google.adicionarReuniao(c);
		google.adicionarReuniao(d);

		for(Reuniao r: google.getReunioesDia(new Data ((short) 12, (short) 11, (short) 2020, (short) 12, (short) 17))) {
			assertEquals(12, r.getData().getDia());
			};
	
	}
	@Test
	public void testGetReuniaoMaisLonga() {

//		OBS: Se existir menos que 10 reuni�es a fun��o ir� quebrar, pois tentar� dar um .getData em uma reuni�o inexistente e bugar�.
//		Para corrigir isso, teria que ser utilizado for(int i = 0; i < tamanho ; i++)
	
//		Assim ele funciona, mas voltar� a ter problemas quando for entre 11 e 19 reunioes...
		google.adicionarReuniao(a);
		google.adicionarReuniao(b);
		google.adicionarReuniao(c);
		google.adicionarReuniao(d);
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		assertEquals(d, google.getReuniaoMaisLonga());

	}
	
	@Test
	public void TesteRemoverParticipante() {
//		OBS: Se existir menos que 10 reuni�es a fun��o ir� quebrar, pois tentar� dar um .getData em uma reuni�o inexistente e bugar�.
//		Para corrigir isso, teria que ser utilizado for(int i = 0; i < tamanho ; i++)
	
//		Assim ele funciona, mas voltar� a ter problemas quando for entre 11 e 19 reunioes...
		google.adicionarReuniao(a);
		google.adicionarReuniao(b);
		google.adicionarReuniao(c);
		google.adicionarReuniao(d);
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		google.removerParticipante("Jos�");
		assertEquals(1,a.getParticipantes().size());
	}
}
