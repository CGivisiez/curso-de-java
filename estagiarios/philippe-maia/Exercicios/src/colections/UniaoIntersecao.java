//lista de exercicios collections exercicio3

package colections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class UniaoIntersecao {

	public static void main(String[] args) {

		//Interseção
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("3");
		lista.add("2");
		lista.add("3");
		lista.add("5");
		lista.add("6");
		lista.add("6");
		lista.add("9");

		HashSet<String> set = new HashSet<String>(lista);

		for (String element : set)
			lista.remove(element);

		TreeSet<String> set2 = new TreeSet<String>(lista);

		for (String intersecao : set2) {
			System.out.print(intersecao + " ");
		}

		
		//União
		TreeSet<String> grupo1 = new TreeSet<String>();
		TreeSet<String> grupo2 = new TreeSet<String>();
		grupo1.add("a");
		grupo1.add("b");
		grupo1.add("c");
		grupo2.add("d");
		grupo2.add("e");
		grupo2.add("f");
		Iterator i1 = grupo1.iterator();
		Iterator i2 = grupo2.iterator();
		while (i1.hasNext()) {
			System.out.print(i1.next());
		}

		while (i2.hasNext()) {
			System.out.print(i2.next());
		}
	}
}


