package zooAnimales;

import gestion.Zona;

public class Ave extends Animal{
	private static Ave[] listado;
	private static int halcones;
	private static int aguilas;
	private String colorPlumas;
	
	public Ave() {
		Ave.listado[Ave.listado.length] = this;
		this.setTotalAnimales(this.getTotalAnimales()+1);
	}
	
	public Ave(String nombre,int edad,String habitat,String genero,String colorPlumas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.setColorPlumas(colorPlumas);
		Ave.listado[Ave.listado.length] = this;
		this.setTotalAnimales(this.getTotalAnimales()+1);
	}
	
	public Ave[] getListado() {
		return listado;
	}
	public void setListado(Ave[] listado) {
		this.listado = listado;
	}
	public String getColorPlumas() {
		return colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	public Ave crearHalcon(String nombre,int edad,String genero) {
		Ave.halcones=+1;
		return(new Ave(nombre,edad,"montañas",genero, "cafe glorioso"));
	}
	public Ave crearAguila(String nombre,int edad,String genero) {
		Ave.aguilas=+1;
		return(new Ave(nombre,edad,"montañas",genero, "blanco y amarillo"));
	}
	public int cantidadAves() {
		return (Ave.aguilas + Ave.halcones);
	}
	public String movimiento() {
		return("volar");
	}
	
}
