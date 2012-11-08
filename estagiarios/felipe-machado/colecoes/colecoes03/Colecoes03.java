package colecoes03;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;



//3 - Implemente um programa que receberá do usuário duas relações de números inteiros positivos e um caractere representando uma das seguintes operações:
//+ união
//* interseção
public class Colecoes03 {
	static Scanner s;
	
	public static void main(String[] args){
		
		Set<Integer> uniao = new TreeSet<Integer>();
		
		System.out.println("Entre com a 1ª relação de numeros:");
		s = new Scanner(System.in);
		String linha1 = s.nextLine();
		System.out.println("Entre com + para uniao e * para interseção");
		s = new Scanner(System.in);
		String linha2 = s.next();
		System.out.println("Entre com a 1ª relação de numeros:");
		s = new Scanner(System.in);
		String linha3 = s.nextLine();
		
		if(linha2.charAt(0) == '+'){
			String linhasSomadas =linha1+", "+linha3;
			String[] relacaoStringLinhasSomadas;
			relacaoStringLinhasSomadas = linhasSomadas.split(", ");
			for (int i = 0 ; i<relacaoStringLinhasSomadas.length; i++){
				uniao.add(Integer.parseInt(relacaoStringLinhasSomadas[i]));
			}	
			System.out.println(uniao.toString());
		}
		else if(linha2.charAt(0) == '*'){
			String[] linhaUm = linha1.split(", ");
			String[] linhaTres = linha3.split(", ");
			List<Integer> linha01 = new ArrayList<Integer>();
			List<Integer> linha03 = new ArrayList<Integer>();
			for (int i = 0; i<linhaUm.length; i++){
				linha01.add(Integer.parseInt(linhaUm[i]));
			}
			for (int i = 0; i<linhaTres.length; i++){
				linha03.add(Integer.parseInt(linhaTres[i]));
			}
			linha01.retainAll(linha03);
			System.out.println(linha01.toString());
		}
	}
}

