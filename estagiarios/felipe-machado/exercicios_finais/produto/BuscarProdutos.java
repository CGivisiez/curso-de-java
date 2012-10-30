package produto;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.TreeSet;


//Crie uma classe BuscaProdutos com um atributo TreeSet de produtos e com os métodos obterProduto(Integer codigo), 
//exibirProdutos() e cargaInicial(). O método carga inicial será chamado para inicializar o treeset com alguns produtos.
//Crie uma exceção chamada ProdutoNaoEncontradoException que será lançada quando obterProduto não encontrar o produto
//referente ao código informado. Crie um método main para testar tudo que foi feito.
public class BuscarProdutos {
	static TreeSet<Produto> listaProdutos = new TreeSet<Produto>();
	static Produto produto;
	
	public Produto obterProduto (Integer codigo) throws ProdutoNaoEncontradoException{
		Iterator<Produto> it = listaProdutos.iterator();
		produto = new Produto();
		while(it.hasNext()){
			produto = it.next();
			if(produto.getCodigo()==codigo){
				return produto;
			}
		}		
	throw new ProdutoNaoEncontradoException("PRODUTO NÃO ENCONTRADO"); 
	}		
	
	public void exibirProdutos(){
		System.out.println(listaProdutos.descendingSet());
		Iterator<Produto> it = listaProdutos.iterator();
		produto = new Produto();
		while(it.hasNext()){
			System.out.println(it.next().toString());
		}
	}
	
	public void cargaInicial(){
		produto = new Produto(1,"Televisão de LED 300", new BigDecimal("1600.00"));
		listaProdutos.add(produto);
		produto = new Produto(2,"Aparelho de som TOSHIBA", new BigDecimal("359.99"));
		listaProdutos.add(produto);
		produto = new Produto(3,"Geladeira BRASTEMP", new BigDecimal("2300.00"));
		listaProdutos.add(produto);
		produto = new Produto(4,"Escova de dente Colgate", new BigDecimal("1600.00"));
		listaProdutos.add(produto);
		produto = new Produto(5,"Video game atari em perfeitas condições", new BigDecimal("30000.00"));
		listaProdutos.add(produto);
		produto = new Produto(6,"CD do Latino", new BigDecimal("0.00"));
		listaProdutos.add(produto);
		produto = new Produto(7,"Bala Juquinha", new BigDecimal("0.05"));
		listaProdutos.add(produto);
	}
	
	public static void main(String[] args){
		BuscarProdutos buscarProdutos = new BuscarProdutos();
		buscarProdutos.cargaInicial();
		try{
			System.out.println(buscarProdutos.obterProduto(0));
		}catch (ProdutoNaoEncontradoException e){
		}
		
		buscarProdutos.exibirProdutos();
	}

}		
		
		
