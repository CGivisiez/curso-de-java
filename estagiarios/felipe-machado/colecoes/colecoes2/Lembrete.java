package colecoes2;

import java.util.ArrayList;
import java.util.List;

//2 - Crie uma classe Lembrete com um atributo List<String> tarefas. Em um método main, crie um mapa cujas chaves serão os dias da semana (String) e 
//os valores serão objetos da classe Lembrete. Escreva algum código demonstrando a estrutura criada.
public class Lembrete {
	List<String> tarefas;
	
	public Lembrete (){
		tarefas = new ArrayList<String>();
	}
	public void adicionaTarefa(String tarefa){
		tarefas.add(tarefa);
	}
	
	public void imprimeListaTarefas(){
		for(int i = 0; i < tarefas.size(); i++){
			System.out.println(tarefas.get(i));
		}
	}	
}
