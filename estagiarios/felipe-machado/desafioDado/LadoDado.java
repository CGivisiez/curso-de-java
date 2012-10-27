package desafioArray01;

public class LadoDado {
	int numeroDoLado, contadorIndiceAcerto;
	
	public LadoDado(){
		
	}
	
	public LadoDado(int numeroDoLado){
		this.numeroDoLado = numeroDoLado;
		contadorIndiceAcerto = 0;
	}

	public int getNumeroDoLado() {
		return numeroDoLado;
	}

	public void setNumeroDoLado(int numeroDoLado) {
		this.numeroDoLado = numeroDoLado;
	}

	public int getContadorIndiceAcerto() {
		return contadorIndiceAcerto;
	}

	public void setContadorIndiceAcerto(int contadorIndiceAcerto) {
		this.contadorIndiceAcerto = contadorIndiceAcerto;
	}
	
	public void somaContador(){
		this.contadorIndiceAcerto++;
	}

}
