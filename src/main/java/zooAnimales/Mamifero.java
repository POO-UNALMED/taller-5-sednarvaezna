package zooAnimales;

import gestion.Zona;

public class Mamifero extends Animal{
	private static Mamifero[] listado;
	private static int caballos;
	private static int leones;
	private boolean pelaje;
	private int patas;
	
	
	public Mamifero() {
		this.listado[this.listado.length] = this;
		this.setTotalAnimales(this.getTotalAnimales()+1);
	}
	
	public Mamifero(String nombre,int edad,String habitat,String genero,boolean pelaje,int patas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.setPelaje(pelaje);
		this.setPatas(patas);
		Mamifero.listado[Mamifero.listado.length] = this;
		this.setTotalAnimales(this.getTotalAnimales()+1);
		
	}
	
	public Mamifero[] getListado() {
		return listado;
	}
	public void setListado(Mamifero[] listado) {
		this.listado = listado;
	}
	public boolean isPelaje() {
		return pelaje;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public Mamifero crearLeon(String nombre,int edad,String genero) {
		Mamifero.leones=+1;
		return(new Mamifero(nombre,edad,"selva",genero, true,4));
	}
	public Mamifero crearCaballo(String nombre,int edad,String genero) {
		Mamifero.caballos=+1;
		return(new Mamifero(nombre,edad,"pradera",genero, true,4));
	}
	public int cantidadMamiferos() {
		return (Mamifero.leones + Mamifero.caballos	);
	}
	
	
}
