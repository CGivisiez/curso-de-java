//lista de exercicios collections exercicio1

package colections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Exercicio1 {

	public static void main(String[] args) {
		Set<Integer> numero = new TreeSet<Integer>();
		for (int i = 1; i <= 1000; i++) {
			numero.add(i);
		}

		Iterator<Integer> i = ((TreeSet<Integer>) numero).descendingIterator();
		while (i.hasNext()) {
			Integer number = i.next();
			System.out.println(number);
		}
	}

}
