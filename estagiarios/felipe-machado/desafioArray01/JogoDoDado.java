package desafioArray01;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JogoDoDado {
	static final int tamanhoDoDado = 6;
	static List<LadoDado> listaDeLados = new ArrayList(tamanhoDoDado-1);
	static Scanner s;
	static int numeroDeJogadas;
	static int numeroRandomico;
	
	
	public static void main(String[] args){
		
		for(int i = 1; i <= tamanhoDoDado; i++){
			listaDeLados.add(new LadoDado(i));
		}
		System.out.println("Entre com o número de vezes que o dado será jogado:");
		s = new Scanner(System.in);
		numeroDeJogadas = s.nextInt();
		
		for (int i = 1; i < numeroDeJogadas; i++){
			numeroRandomico = (int) (1+Math.random() * 6); 			
			for (LadoDado ladoDado: listaDeLados){
				if (ladoDado.getNumeroDoLado() == numeroRandomico){
					ladoDado.somaContador();	
				}
			}	
		}
		for (LadoDado ladoDado: listaDeLados){
			System.out.println("  -O lado de número " +ladoDado.getNumeroDoLado()+ " foi sorteado " 
					+ladoDado.getContadorIndiceAcerto()+ " vezes.");	
		}
	}	
}
