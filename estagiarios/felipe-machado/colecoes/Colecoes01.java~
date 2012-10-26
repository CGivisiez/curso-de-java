import java.util.Iterator;
import java.util.TreeSet;

//Gere todos os números entre 1 e 1000 e ordene em ordem decrescente utilizando um TreeSet.
public class Colecoes01 {
	public static void main(String[] args){
		
		TreeSet<Integer> tSet = new TreeSet<Integer>(); 
		
		for (int i= 1; i<=1000;i++ ){
			tSet.add(i);
		} 
		 
		System.out.print(tSet.descendingSet());

		 // mestre, teria como inverter isto sem criar um novo array para receber o it.next??
		Iterator<Integer> it = tSet.iterator();
		while(it.hasNext()){
			Integer inteiro = it.next();
			System.out.println(inteiro);
		}
		System.out.print(tSet.descendingSet());			
	}	
}

