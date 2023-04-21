package trab_faculdade;

// Classe com extends para a Classe Abstrata Moeda 
public class Dolar extends Moeda {
	private double valorCotacao = 5.5;
	

	//Métodos de get e set implementados seguindo as boas práticas de Programação Orientada à Objetos
	public double getValor () {
		return valor;
	}
	
	public void setValor( double valor) {
		this.valor = valor;
	}
	
	
	// Métodos abaixos oriundos da classe abstrata Moeda, com sua implementação a seguir.
	@Override
	public void info() {
		// Método responsável pela impressão do valor total nessa moeda e seu valor de cotação
		System.out.printf("Valor total em Dolares: "+this.valor + " Cotação atual: "+valorCotacao);
	}

	@Override
	public double converter() {
		// Método responsável por realizar a conversão
		double totalConvertido = this.valor * this.valorCotacao;
		return totalConvertido;
	}

}
