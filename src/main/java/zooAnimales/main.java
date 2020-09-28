package zooAnimales;

import gestion.Zona;
import gestion.Zoologico;
import zooAnimales.Anfibio;
import zooAnimales.Ave;
import zooAnimales.Mamifero;
import zooAnimales.Pez;
import zooAnimales.Reptil;

public class main {

	
	
	public static void main(String[] args) {

		new Anfibio();
		new Anfibio();
		new Mamifero();
		new Mamifero();
		new Mamifero();
		new Reptil();
		new Pez();
		new Ave();
		new Ave();
		boolean ok = false;
		System.out.println(Animal.totalPorTipo());
		
		
	}

}
