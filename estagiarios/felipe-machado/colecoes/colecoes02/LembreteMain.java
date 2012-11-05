package colecoes02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

//2 - Crie uma classe Lembrete com um atributo List<String> tarefas. Em um método main, crie um mapa cujas chaves serão os dias da semana (String) e 
//os valores serão objetos da classe Lembrete. Escreva algum código demonstrando a estrutura criada.

public class LembreteMain {
	private static Lembrete lembrete = new Lembrete();
	private static Scanner s;
	private static Iterator<?> it;
	public static void main(String[] args) {
		
		HashMap<String, Lembrete> agenda = new HashMap<String, Lembrete>();	
		Set<?> set = agenda.entrySet();
		Map.Entry<String, Lembrete> mapEntry; 
		boolean continua = true;
		while(continua){
			System.out.println("Digite um dia da semana");
			s = new Scanner (System.in);
			String diaSemana = s.nextLine();
			if (agenda.containsKey(diaSemana)){
				it = set.iterator();
				while (it.hasNext()){
					mapEntry = (Entry<String, Lembrete>) it.next();
					if (mapEntry.getKey().equals(diaSemana)){
						lembrete = mapEntry.getValue();
					}		
				}		
			}
			else {
				lembrete = new Lembrete();
			}
			System.out.println("Digite a tarefa para "+diaSemana);
			s = new Scanner(System.in);
			String tarefa = s.nextLine();
			lembrete.adicionaTarefa(tarefa);
			agenda.put(diaSemana, lembrete);
			it = set.iterator();
			while(it.hasNext()){
				mapEntry = (Entry<String, Lembrete>) it.next();
				System.out.println("Tarefas para "+mapEntry.getKey());
				lembrete = mapEntry.getValue();
				lembrete.imprimeListaTarefas();
			}
		}	
	}

}
