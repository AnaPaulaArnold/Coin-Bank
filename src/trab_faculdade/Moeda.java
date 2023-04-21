package trab_faculdade;

// Classe abstrata criado seguindo exigências do Trabalho
public abstract class Moeda {
	// Atributo utilizado nas classes Real, Dolar e Euro
	protected double valor;
	
	// Métodos implementados nas classes Real, Dolar e Euro
	public abstract void info();
	public abstract double converter();
}
