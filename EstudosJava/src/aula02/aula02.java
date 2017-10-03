package aula02;

import java.util.Scanner;

public class aula02 {
		
	public static void main (String args[])  throws Exception{
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		/*-----------------------------------------------------------------------------------------------------
		* Recebendo um valor inteiro
		-----------------------------------------------------------------------------------------------------*/
		int nBase;
		
		System.out.println("Informe um n�mero: ");
		nBase = entrada.nextInt();
		
		System.out.println("--------> O Numero Inteiro digitado �: " +nBase+" <---------");
		System.out.println("");
		
		/*-----------------------------------------------------------------------------------------------------
		* Recebendo um valor real com FLOAT
		-----------------------------------------------------------------------------------------------------*/
		float preco;

		System.out.printf("Informe o pre�o da mercadoria R$ \n");
		preco = entrada.nextFloat();
		
		System.out.println("--------> A mercadoria custa R$" +preco +" <---------");		
		System.out.println("");		

		/*-----------------------------------------------------------------------------------------------------
		 * Recebendo um valor real com DOUBLE
		-----------------------------------------------------------------------------------------------------*/
		double salario;

		System.out.printf("Informe o sal�rio do Funcion�rio = R$ \n");
		salario = entrada.nextDouble();	
	
		System.out.println("--------> O Sal�rio informado R$" +salario+" <---------");		
		System.out.println("");
	
		/*-----------------------------------------------------------------------------------------------------
		 * Recebendo uma String, usado na leitura de palavras simples que n�o usam "espa�o"
		-----------------------------------------------------------------------------------------------------*/
		String cPalavra;
		
		System.out.printf("Informe uma palavra:\n ");
		cPalavra = entrada.next();
				
		System.out.println("--------> Sua palavra � " +cPalavra+" <---------");
		System.out.println("");

		/*-----------------------------------------------------------------------------------------------------
		 * Recebendo uma String composta de mais de uma palavra, como por exemplo uma Frase.
		 -----------------------------------------------------------------------------------------------------*/
		String cFrase;
		entrada.nextLine();		 // esvazia o buffer do tecla
		
		System.out.printf("Crie uma frase: ");
		cFrase = entrada.nextLine();  // atribui a frase na vari�vel
		
		System.out.println("--------> Frase: " + cFrase + " <---------");
		System.out.println("");
			
	}

}
