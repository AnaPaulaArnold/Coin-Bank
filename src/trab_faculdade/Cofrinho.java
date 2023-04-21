package trab_faculdade;
import java.util.ArrayList;
import java.util.Scanner;

public class Cofrinho {
	private ArrayList<String> listaMoedas = new ArrayList<String>();
	Scanner scanner = new Scanner(System.in);
	private Dolar dolar = new Dolar();
	private Real real = new Real();
	private Euro euro = new Euro();
	
	// Construtor responsável por iniciar o Array de opções de Moedas
	Cofrinho() {
		this.listaMoedas.add("Dolar");
		this.listaMoedas.add("Euro");
		this.listaMoedas.add("Real");
	};
	
	// Método responsável por imprimir no Console o Total de Moedas em cada opção e sua cotação (Método exibido na opção 3 do Menu)
   public void listagemMoedas() {
		System.out.println("As moedas disponíveis em seu Cofrinho são: \n ");
		dolar.info();
		System.out.println("\n");
		euro.info();
		System.out.println("\n");
		real.info();
	};
	
	
	//Método responsável por retornar a opção de Moeda escolhida pelo usuário para ser adicionado (Método chamado na opção 1 do Menu)
	private int MenuMoedaAdicionar() {
		int moedaMenu;
		
		System.out.println("Qual a moeda que deseja adicionar? \n 1 - Dolar \n 2 - Euro \n 3 - Real");
		moedaMenu = scanner.nextInt();
		
		switch(moedaMenu) {
		case 1:
			System.out.println("Moeda escolhida: Dolar");
			break;
		case 2: 
			System.out.println("Moeda escolhida: Euro");
			break;
		case 3:
			System.out.println("Moeda escolhida: Real");
			break;
		default:
			System.out.println("Moeda escolhida inválida");
			break;
		};
		
		return moedaMenu;	
	};
	
	//Método responsável por retornar a opção de Moeda escolhida pelo usuário para ser removida (Método chamado na opção 2 do Menu)
	private int MenuMoedaRemover() {
		int moedaMenuRemover;
		
		System.out.println("Qual a moeda que deseja remover? \n 1 - Dolar \n 2 - Euro \n 3 - Real");
		moedaMenuRemover = scanner.nextInt();
		
		switch(moedaMenuRemover) {
		case 1:
			System.out.println("Moeda escolhida: Dolar");
			break;
		case 2: 
			System.out.println("Moeda escolhida: Euro");
			break;
		case 3:
			System.out.println("Moeda escolhida: Real");
			break;
		default:
			System.out.println("Moeda escolhida inválida");
			break;
		};
		
		return moedaMenuRemover;	
	}
	
	// Método responsável por realizar a Adição de moedas, de acordo com a opção escolhida (Método chamado na opção 1 do Menu)
	public void adicionar(double Moeda) {
		int menu = MenuMoedaAdicionar();
		
		if(menu == 1) {
			double valorAtual = dolar.getValor();
			dolar.setValor(valorAtual + Moeda);
			dolar.info();
		}else if( menu == 2 ){
			double valorAtualEuro = euro.getValor();
			euro.setValor(valorAtualEuro + Moeda);
			euro.info();
		}else if( menu == 3) {
			double valorAtualReal = real.getValor();
			real.setValor(valorAtualReal + Moeda);
			real.info();
		}
	};
	
	// Método responsável por realizar a Remoção de moedas, de acordo com a opção escolhida (Método chamado na opção 2 do Menu)
	public void remover(double Moeda) {
		int menuRemover = MenuMoedaRemover();
		
		if(menuRemover == 1) {
			double valorAtual = dolar.getValor();
			dolar.setValor(valorAtual - Moeda);
			dolar.info();
		}else if( menuRemover == 2 ){
			double valorAtualEuro = euro.getValor();
			euro.setValor(valorAtualEuro - Moeda);
			euro.info();
		}else if( menuRemover == 3) {
			double valorAtualReal = real.getValor();
			real.setValor(valorAtualReal - Moeda);
			real.info();
		}
	}; 
	
	// Método responsável por imprimir no Console a soma de todas as moedas no Cofrinho já convertidas para Real
	public void totalConvertido() {
		double totalConvertidoDolar = dolar.converter();
		double totalConvertidoEuro = euro.converter();
		double totalConvertidoReal = real.converter();
		
		double valorTotalCofrinho = totalConvertidoDolar + totalConvertidoEuro + totalConvertidoReal;
		System.out.println("O valor total em seu Cofrinho convertido segundo as cotações é:  " + valorTotalCofrinho);
	};
	
	
	public static void main(String[] args) {
		
	}
}
