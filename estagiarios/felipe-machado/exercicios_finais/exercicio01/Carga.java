

//1 - Crie a classe Carga com o atributo double peso. Ela terá um construtor e um método setter para o peso. Valide o peso (peso > 0) 
//antes de jogar no atributo e caso seja inválido lance a exceção IllegalArgumentException do pacote lang.
public class Carga extends Exception{
	double peso;
	
	public Carga(){
		
	}
	
	public void setPeso(double peso) throws Exception{
		if (peso > 0.0){
		 this.peso = peso;
		}
		else{
			throw new IllegalArgumentException(); 
		}
	}
}
