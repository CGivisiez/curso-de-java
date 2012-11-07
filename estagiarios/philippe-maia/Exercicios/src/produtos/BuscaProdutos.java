package produtos;

import java.util.TreeSet;

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
public class BuscaProdutos {

	public Integer obterProduto(Integer codigo) {
		return codigo;
	}

	public void exibirProdutos() {

	}

	public void cargaInicial() {

		TreeSet<Produto> produtos = new TreeSet<Produto>();
		//produtos.add(e);
		
		
	}

	public static void main(String[] args) {
		BuscaProdutos bp = new BuscaProdutos();
		bp.cargaInicial();
		
	}
}
