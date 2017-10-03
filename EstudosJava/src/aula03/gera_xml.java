package aula03;

import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class gera_xml {

	public static void main(String[] args) throws JAXBException, IOException {
		// TODO Auto-generated method stub
		aula03 geraXml = new aula03();
		
		// faz a atribuição na classe aula02
		geraXml.setcNome("Luiz Carlos Santos Junior");
		geraXml.setnNumero(42);
		
		// 
		JAXBContext Context = JAXBContext.newInstance(aula03.class);
		Marshaller marshal = Context.createMarshaller();
		
		// imprime no console
		marshal.marshal(geraXml, System.out);

		// gera arquivo xml
		FileWriter Whilter = new FileWriter("Teste_Geracao_xml_java.xml") ;
		marshal.marshal(geraXml, Whilter);
		
	}

}
