package aula03;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "familia")

public class aula03 {
	private String cNome = "";
	private int nNumero = 0;
	
	public String getcNome() {
		return cNome;
	}
	public void setcNome(String cNome) {
		this.cNome = cNome;
	}
	public int getnNumero() {
		return nNumero;
	}
	public void setnNumero(int nNumero) {
		this.nNumero = nNumero;
	}

}
