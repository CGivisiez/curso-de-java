package produtos;

import java.math.BigDecimal;

/*
 *  Crie um pacote produtos. Dentro dele crie a classe Produto
 *  com os atributos codigo (Integer), descricao (String) e preco (BigDecimal).
 *  Crie para ela os métodos equals e hashCode (baseados no codigo),
 *  e faça com que implemente Comparable<Produto> baseando o compareTo na descrição.
 *  Sobrescreva também o método toString.
 *  Crie uma classe BuscaProdutos com um atributo TreeSet de produtos e com os
 *  métodos obterProduto(Integer codigo), exibirProdutos() e cargaInicial().
 *  O método carga inicial será chamado para inicializar o treeset com alguns produtos.
 *  Crie uma exceção chamada ProdutoNaoEncontradoException que será lançada 
 *  quando obterProduto não encontrar o produto referente ao código informado.
 *  Crie um método main para testar tudo que foi feito.
 * 
 */
public class Produto implements Comparable<Produto>{
    
	private Integer codigo;
	private String descricao;
	private BigDecimal preco;
	
	@Override
	public boolean equals(Object obj) {
		return (obj instanceof Produto) && (this.codigo.equals(((Produto)obj).getCodigo()));
	}
	
	private Integer getCodigo() {
		return codigo;
	}

	@Override
	public int hashCode() {
		return codigo;
	}
	
	@Override
	public int compareTo(Produto o) {
		return this.descricao.compareTo(o.descricao);
	}
	
	public String toString(){
		return codigo + ", " + descricao + ", " + preco;
	}
	
}
