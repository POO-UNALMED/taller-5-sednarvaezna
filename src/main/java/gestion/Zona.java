package gestion;

import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico[] zoo;
	private Animal[] animales;
	
	public Zona(){
		
	}
	
	public Zona(String nombre,Zoologico[] zoo, Animal[] animales) {
		this.setAnimales(animales);
		this.setZoo(zoo);
		this.nombre = nombre;
	}
	public void agregarAnimales(Animal animal) {
		this.animales[this.animales.length]=animal;
		
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
	public Zoologico[] getZoo() {
		return zoo;
	}
	public void setZoo(Zoologico[] zoo) {
		this.zoo = zoo;
	}
	public Animal[] getAnimales() {
		return animales;
	}
	public void setAnimales(Animal[] animales) {
		this.animales = animales;
	}
	
}
