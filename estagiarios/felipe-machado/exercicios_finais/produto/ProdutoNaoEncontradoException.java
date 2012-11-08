package produto;

public class ProdutoNaoEncontradoException extends Exception {
	
	private static final long serialVersionUID = 1L;

		public ProdutoNaoEncontradoException (String msg){
			super(msg);
			System.out.println(msg);			
		}
		
		public ProdutoNaoEncontradoException (){
			
		}


}
