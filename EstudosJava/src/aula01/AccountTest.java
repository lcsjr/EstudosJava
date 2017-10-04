package aula01;
//Livro: Java - Como Programar 10ª edição
//Cap. 3 - Figura 3.2
//Cria e manipula um objeto Account

import java.util.Scanner;

public class AccountTest {
	
	public static void main(String[] args) {
		
		// cria o objeto Scanner para entrada de dados via prompt
		Scanner entradaDados = new Scanner(System.in);
		
		// cria objeto Account passando dois parâmetros de inicialização
		Account myAccount = new Account("Luiz Santos", 0);
		myAccount.deposito(12789.90);
				
		/* Código antigo.. antes da implementação do construtor 
		System.out.printf("Nome Inicial é:%s%n%n", myAccount.getName());		
		System.out.println("Por favor, informe o nome:");
		String theName= entradaDados.nextLine();
		myAccount.setName(theName);
		System.out.println();
		*/
		
		System.out.println("O Saldo da conta de " + myAccount.getName()+" é "+ myAccount.getBalance());
		
		// fecha oobjeto de entradaDados
		entradaDados.close();
	}

}
