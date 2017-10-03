package aula01;
//Livro: Java - Como Programar 10� edi��o
//Cap. 3 - Figura 3.2
//Cria e manipula um objeto Account

import java.util.Scanner;

public class AccountTest {
	
	public static void main(String[] args) {
		
		// cria o objeto Scanner para entrada de dados via prompt
		Scanner entradaDados = new Scanner(System.in);
		
		// cria objeto Account
		Account myAccount = new Account();
				
		System.out.printf("Nome Inicial �:%s%n%n", myAccount.getName());
		
		System.out.println("Por favor, informe o nome:");
		String theName= entradaDados.nextLine();
		myAccount.setName(theName);
		System.out.println();
		
		System.out.printf("O nome informado para o objeto myAccount �:%n%s%n", myAccount.getName());
		
		entradaDados.close();
	}

}
