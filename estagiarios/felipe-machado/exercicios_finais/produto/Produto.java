package produto;

import java.math.BigDecimal;


//2 - Crie um pacote produtos. Dentro dele crie a classe Produto com os atributos codigo (Integer), descricao (String) 
//e preco (BigDecimal). Crie para ela os métodos equals e hashCode (baseados no codigo), e faça com que implemente 
//Comparable<Produto> baseando o compareTo na descrição. Sobrescreva também o método toString. 
//Crie uma classe BuscaProdutos com um atributo TreeSet de produtos e com os métodos obterProduto(Integer codigo), 
//exibirProdutos() e cargaInicial(). O método carga inicial será chamado para inicializar o treeset com alguns produtos.
//Crie uma exceção chamada ProdutoNaoEncontradoException que será lançada quando obterProduto não encontrar o produto
//referente ao código informado. Crie um método main para testar tudo que foi feito.

public class Produto implements Comparable<Produto>{
	Integer codigo;
	String descricao;
	BigDecimal preco;
	
	public Produto(){
		
	}
	
	public Produto(Integer codigo, String descricao, BigDecimal preco){
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public Integer getCodigo(){
		return this.codigo;
	}
	public void setCodigo(Integer codigo){
		this.codigo = codigo;
	}
	@Override
	public String toString(){

		String c = this.codigo.toString();
		return (c+" "+this.descricao+" "+this.preco);
	}
	
	public boolean equals(Produto obj){
		if (obj==null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		final Produto produto = (Produto) obj;
		if ((this.codigo == null) ? (produto.codigo != null) : !this.codigo.equals(produto.codigo)){
			return false;
		}
		return true;
	}
	
	
	@Override
	public int hashCode(){
		int hash = 9;
		hash = 67 * hash +(this.codigo != null ? this.codigo.hashCode() : 0);
		return hash;
	}


	@Override
	public int compareTo(Produto produto) {
		if(produto == null){
			return -1;
		}
		if(this.codigo<produto.codigo){
			return -1;
		}
		if(this.codigo>produto.codigo){
			return -1;
		}
		return 0;
	}
	
	
		
	
}
