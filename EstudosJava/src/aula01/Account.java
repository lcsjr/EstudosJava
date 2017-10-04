package aula01;

// Livro: Java - Como Programar 10ª edição

public class Account {
	
	private String name;
	private double balance;
	
	/*
	 *  Construtor de Account que recebe dois parametros.
	 *  O nome de um construtor deve ser o mesmo da classe.
	 */
	public Account (String name, double balance ) {
		this.name = name;
		/*
		 * verifica se o parâmetro recebido de balance é maior que zero,
		 * se não ele mantém seu valor default de inicialização
		 */
		if (balance > 0.0 ) {
			this.balance = balance;
		}			
	}
	public void deposito ( double valorDepositado) {
		if (valorDepositado > 0.0 ) {
			balance = balance + valorDepositado;
		}
	}
	
	public double getBalance() {
		return this.balance;
	}

	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

}
