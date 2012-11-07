import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		Exercicios aula = new Exercicios();
		aula.exercicio1(1);
		System.out.println(aula.exercicio2("1 2 3 4 5 6 7 8 9"));
		System.out.println(aula.exercicio3());
		System.out.println(aula.exercicio4(2));
		System.out.println(aula.exercicio5(6));
		aula.exercicio6();
		System.out.println(aula.exercicio7(100,100));
		aula.exercicio8();
		aula.exercicio9(7);
		System.out.println(aula.exercicio10(45));
    }

	
	public void exercicio1(int numero) {

		if (numero>0){
			System.out.println("Positivo");
		}else if (numero<0){
			System.out.println("Negativo");
		}else{
			System.out.println("Igual a zero");
		}
			
	}


	public int exercicio2 (String frase){
		int contadorSpace = 0;
		for (char caracter : frase.toCharArray()){
			if (caracter == ' '){
			contadorSpace++;
			}	
		}	
		return (frase.length() - contadorSpace);	
	}


	public int exercicio3(){
		
		int soma=0;

		for(int contador=1;contador<=9999;contador++){
			soma=soma+contador;
		}
		return soma;			

	}

	
	public int exercicio4(int limite){
		
		int soma=0;

		for (int contador=1;contador<=limite;contador++){
			soma=soma+contador;
		}
		return soma;
	}


	public int exercicio5(int limite){
			
		int soma=0;
		for (int contador=0;contador<=limite;contador++){
			if (contador % 2 == 0){
				soma=soma+contador;
			}
		}
		
		return soma;
	}



	public void exercicio6(){
		
		int contadorMult=0;
		
		for(int contador=1;contador<=1000;contador++){
			if (contador % 3 == 0){ 
				contadorMult++;
				System.out.println("Numero: " + contador +  " é multiplo de 3");
			}
		}
		
		System.out.println("Quantidade de multiplos de 3= " + contadorMult);
	}


	public double exercicio7(double comissao, double salario){	
		
		comissao=comissao + comissao*0.2;
		return salario+comissao;

        }
	
	public void exercicio8(){
		
		int contador=0;
		double salario=0, comissao=0;
		do{	            		
			System.out.println("Digite o valor do salario base:");
           		salario = new Scanner(System.in).nextDouble();
            		System.out.println("Digite o valor da comissao:");
            		comissao = new Scanner(System.in).nextDouble();	
			System.out.println("O salario total é: " + (salario+comissao));
		} while(salario!=0 && comissao!=0);
		
		
	}	


	public void exercicio9(int numero){
		
		switch (numero) {
            	
		case 1:
                System.out.println("Janeiro");
                break;

            	case 2:
                System.out.println("Fevereiro");
                break;

            	case 3:
                System.out.println("Março");
                break;

            	case 4:
                System.out.println("Abril");
                break;


            	case 5:
                System.out.println("Maio");
                break;


            	case 6:
                System.out.println("Junho");
                break;


            	case 7:
                System.out.println("Julho");
                break;


            	case 8:
                System.out.println("Agosto");
                break;

            	case 9:
                System.out.println("Setembro");
                break;


            	case 10:
                System.out.println("Outubro");
                break;


            	case 11:
                System.out.println("Novembro");
                break;


            	case 12:
                System.out.println("Dezembro");
                break;
		
		default:
		System.out.println("Mês inexistente.");
        }


    }

	public double exercicio10(double segundos){
		double minutos=0;
		minutos=segundos/60;
		
		return minutos;
	}


		

}
