package app;

import java.util.ArrayList;
import java.util.List;

public class MercadoLivre {
		
	private Produto [] produtos;
	private int posicao;
	
	private MercadoLivre () {
		this.produtos = new Produto[10];
		this.posicao = 0;
	}
	
	private MercadoLivre (int tamanho) {
		this.produtos = new Produto[tamanho];		
	}
	
	public void anunciarProduto(Produto p) {
		if (posicao >= produtos.length) {
			duplicaArray();
		}
		this.produtos[posicao] = p;
		posicao++;
		}
	
	public void duplicaArray() {
		Produto[] produtosAux = new Produto[2*posicao];
		for (int i = 0; i < produtos.length; i++) {
			produtosAux[i] = this.produtos[i];
		}
		this.produtos = produtosAux;
	}
	
	public void anunciarProduto (double preco, String nome, String vendedor, Data dataAnuncio) {
		anunciarProduto(new Produto(preco, nome, vendedor, dataAnuncio));
	}
	
	public int getQuantidadeProdutos() {
		return posicao;
	}
	
// Essas duas questões abaixo, fiz com for indexado e for-each, para que eu possa entender melhor as diferenças de trabalhar com um e outro.	
	
//	----------------------------------------------------------------------------------------------------------------------------------------
	
	public List<Produto> getProdutosVendedor(String vendendo){
		List<Produto> produtosVendedor = new ArrayList<Produto>();
		for (int i = 0; i<produtos.length; i++) {
			if(vendendo == produtos[i].getVendedor()) {
				produtosVendedor.add(produtos[i]);
			}
		}
		return produtosVendedor;
	}
	
//										DUVIDA: Essa seria a foram correta de se fazer por for-each?

//	public List<Produto> getProdutosVendedor(String vendendo){
//		List<Produto> produtosVendedor = new ArrayList<Produto>();
//		for (Produto p : produtos) {
//			if(vendendo == p.getVendedor()) {
//				produtosVendedor.add(p);
//			}
//		}
//		return produtosVendedor;
//	}

//	----------------------------------------------------------------------------------------------------------------------------------------
	
	public List<Produto> getProdutosComPalavra (String palavra){
		List<Produto> contem = new ArrayList<Produto>();
			for (int i = 0; i<produtos.length; i++) {
				if(palavra == produtos[i].getNome()) {
					contem.add(produtos[i]);
				}
		}
		return contem;
	}

//										DUVIDA: Essa seria a foram correta de se fazer por for-each?

//	public List<Produto> getProdutosComPalavra (String palavra){
//		List<Produto> contem = new ArrayList<Produto>();
//			for (Produto p : produtos) {
//				if (palavra == p.getNome()) {
//					contem.add(p);
//				}
//			}
//			return contem;
//	}
//}
//----------------------------------------------------------------------------------------------------------------------------------------

//	
//	public List<Produto> getIndiceMaisAntigo (String vendedor) {
//			
//			List<Produto> listaVendedor = getProdutosVendedor(vendedor);
//			List<Produto> listaFinal = new ArrayList<Produto>();
//			
//			for (int i=0; i<produtos.length; i++) {
//				if(listaVendedor.get(i+1).getDataAnuncio().getAno() > listaVendedor.get(i).getDataAnuncio().getAno() && 
//				listaVendedor.get(i+1).getDataAnuncio().getMes() > listaVendedor.get(i).getDataAnuncio().getMes() &&
//				listaVendedor.get(i+1).getDataAnuncio().getDia() > listaVendedor.get(i).getDataAnuncio().getDia() &&
//				listaVendedor.get(i+1).getDataAnuncio().getHora() > listaVendedor.get(i).getDataAnuncio().getHora()) {
//					listaFinal.add(listaVendedor.get(i+1));										
//				}
//			}
//			return listaFinal;	
//		}
//		
//		public void removeMaisAntigo(String vendedor) {
//			List<Produto> removiveis = getIndiceMaisAntigo(vendedor);
//			for (Produto p : produtos) {
//				if (p == removiveis && p.getVendedor() == vendedor) {
//				
//				}
//		}
//}
}