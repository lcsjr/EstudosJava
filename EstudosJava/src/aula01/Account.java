package aula01;

// Livro: Java - Como Programar 10� edi��o
// Cap. 3 - Figura 3.1
// Classe Acoount que cont�m uma vari�vel de inst�ncia 
// e m�todos para configurar e obter seu valor

public class Account {
	
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

}
