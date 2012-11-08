
import java.util.Scanner;

public class CargaPrincipal {
	
	static Carga carga = new Carga();
	
	public static void main(String[] args) throws Exception{
		System.out.println("Entre com o peso da carga:");
		Scanner s = new Scanner(System.in);
		double peso = s.nextDouble();
		try{
			carga.setPeso(peso);
		}catch(IllegalArgumentException e){
			System.out.println("erro, peso menor que zero");
		}
		
	}

}
