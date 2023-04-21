package trab_faculdade;
import java.util.Scanner;

public class Principal{
	
	public static void main(String[] args) {
		// Essa é a classe principal do Programa Cofrinho, é onde estará sendo feito o controle do menu de interação do usuário.
		
		// Instanciações 
		  Scanner scanner = new Scanner(System.in);
		  Cofrinho cofrinho = new Cofrinho();
		 
		  // Variáveis de controle do menu
			int menu = 1;
			while(menu != 0) {
				
			// While responsável por manter a exibição do menu no Console até o usuário digitar a opção '5 - Sair
			System.out.println(" \n\nBem-vindo(a) ao seu Cofrinho! \nEscolha uma das opções abaixo: \n 1 - Adicionar Moedas \n 2 - Remover Moedas \n 3 - Listar Moedas \n 4 - Total Convertido \n 5 - Sair");
			 menu = scanner.nextInt();
			
				switch(menu) {
				//Switch case responsável por controlar a opção escolhida pelo usuário
				case 1: 
					// Case responsável por chamar o método de Adição de Moedas
					System.out.println("Digite o valor que deseja adicionar (número decimais, utilizar vírgula) : ");
					double valor = scanner.nextDouble();
					cofrinho.adicionar(valor);
					break;
				case 2:
					//Case responsável por chamar o método de Remoção de Moedas 
					System.out.println("Digite o valor que deseja remover (número decimais, utilizar vírgula) : ");
					double valorRemover = scanner.nextDouble();
					cofrinho.remover(valorRemover);
					break;
				case 3:
					//Case responsável por chamar o método de Listagem das Moedas Atualmente no Cofrinho
					cofrinho.listagemMoedas();
					break;
				case 4:
					//Case responsável por chamar o método que imprime no Console o Total convertido para Reais
					cofrinho.totalConvertido();
					break;
				case 5:
					// Case responsável por encerrar a exibição do Menu no console
					System.out.println("Encerrando...");
					menu = 0;
					break;
				default:
					//Case caso o usuário insira uma opção inválida 
					System.out.println("Opção inválida");
					break;
				};
			}
	}
}
