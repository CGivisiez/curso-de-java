//lista de exercicios collections exercicio2

package colections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Crie uma classe Lembrete com um atributo List<String> tarefas.
 *  Em um método main, crie um mapa cujas chaves serão os dias da semana (String)
 *  e os valores serão objetos da classe Lembrete. Escreva algum código 
 *  demonstrando a estrutura criada.
 * 
 */
public class Lembrete {
	
	private List<String> tarefas;

	public List<String> getTarefas() {
		return tarefas;
	}

	public void setTarefas(List<String> tarefas) {
		this.tarefas = tarefas;
	}
	
	public static void main(String[] args) {
		
		List<String> valores = new ArrayList<String>();	
		List<String> valores2 = new ArrayList<String>();
		List<String> valores3 = new ArrayList<String>();
		Map<String, List<String>> mapa = new HashMap<String, List<String>>();
		
		valores.add("estudar");
		valores.add("trabalhar");
		valores.add("ler");
		
		valores3.add("trabalhar");
		valores3.add("malhar");
		
		valores2.add("namorar");
		valores2.add("jogar");
				
		mapa.put("Segunda-Feira", valores);
		mapa.put("Terca-feira", valores3);
		mapa.put("Quarta-Feira",valores);
		mapa.put("Quinta-Feira", valores3);
		mapa.put("Sexta-Feira", valores);
		mapa.put("Sabado", valores2);
		mapa.put("Domingo", valores2);
		
		System.out.println(mapa);
		
	}
	
}
