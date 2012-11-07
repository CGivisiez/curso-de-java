//Exercicio1 da ultima lista de exercicios

public class Carga {
	
	private double peso;
	
	public Carga(double peso) {
		super();
		this.peso = peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getPeso(){
		return peso;
	}
	
	
	public static void main(String[] args) {
		Carga c = new Carga(-2.);
		try {
			if(c.getPeso()>0){
				System.out.print(c.getPeso());
			}else{
				throw new IllegalArgumentException("Não é possivel uma pessoa ter o peso negativo");
			}
			
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

}
