package gestion;

import zooAnimales.Animal;
import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private static Animal[] animales;
	
	public Zona(){
		
	}
	
	public Zona(String nombre,Zoologico zoo) {
		this.setZoo(zoo);
		this.nombre = nombre;
	}
	public void agregarAnimales(Animal animal) {
		this.setAnimales(animal);
	}
	public int cantidadAnimales() {
		return(this.animales.length);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Zoologico getZoo() {
		return zoo;
	}
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	public Animal[] getAnimales() {
		return animales;
	}
	public void setAnimales(Animal animal) {
		if (Zona.animales ==null) {
			Zona.animales = new Animal[1];
			Zona.animales[0]=animal;
		}
		else {
			Animal[] oldAnimal = new Animal[Zona.animales.length];
			for (int i=0;i<Zona.animales.length;i++) {
				oldAnimal[i]=Zona.animales[i];
			}
			
			Zona.animales = new Animal[Zona.animales.length + 1];
					
			for (int i=0;i<oldAnimal.length;i++) {
				Zona.animales[i]=oldAnimal[i];
			
				Zona.animales[Zona.animales.length-1]=animal;
			}
		}
	}
	
}
