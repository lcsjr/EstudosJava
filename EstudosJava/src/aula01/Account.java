package aula01;

// Livro: Java - Como Programar 10ª edição
// Cap. 3 - Figura 3.1
// Classe Acoount que contém uma variável de instância 
// e métodos para configurar e obter seu valor

public class Account {
	
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

}
