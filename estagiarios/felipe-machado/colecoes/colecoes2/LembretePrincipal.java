package colecoes2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;



public class LembretePrincipal{
	
	
	private static Lembrete lembrete = new Lembrete();
	private static Scanner s;
	private static Iterator<?> it;
	private static Set<?> set;
	
	public static void main(String[] args) {
		HashMap<String, Lembrete> agenda = new HashMap<String, Lembrete>();
		Map.Entry<String, Lembrete> mapEntry;
		
		boolean continua = true;
		while(continua){
			System.out.println("Digite o numero correspondente a ação:\n");
			System.out.println(" 1 - Inserir Tarefas");
			System.out.println(" 2 - Imprimir tarefas da semana inteira");
			System.out.println(" 3 - Sair");
			s = new Scanner(System.in);
			int opcao = s.nextInt();
			switch(opcao){
				
			case 1:
				
				System.out.println("Entre com o dia da semana:");
				s = new Scanner(System.in);
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
				boolean continuaTarefas = true;
				while(continuaTarefas){
					System.out.println("Digite o numero correspondente a ação:\n");
					System.out.println(" 1 - Adicionar tarefa para "+diaSemana);
					System.out.println(" 2 - Voltar ao menu principal");
					s = new Scanner(System.in);
					int opcao2 = s.nextInt();
					switch(opcao2){
					
					case 1:
						System.out.println("Insira a tarefa:");
						s = new Scanner(System.in);
						String tarefa = s.nextLine();
						lembrete.adicionaTarefa(tarefa);
						break;
						
					case 2:
						agenda.put(diaSemana, lembrete);
						continuaTarefas=false;
						break;
					}
				}
				break;
				
			case 2:
				set = agenda.entrySet();
				Iterator<?> it = set.iterator();
				while (it.hasNext()){
					mapEntry = (Entry<String, Lembrete>)it.next();
					System.out.println("Compromissos para  " +mapEntry.getKey() + "\n");
					lembrete = mapEntry.getValue();
					lembrete.imprimeListaTarefas();
				}	
				break;
				
			case 3:
				continua = false;
				break;
			}
		}	
	}

}
