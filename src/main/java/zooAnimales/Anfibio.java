package zooAnimales;

public class Anfibio extends Animal {
	public static Anfibio[] listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		Anfibio.listado[Anfibio.listado.length] = this;
		this.setTotalAnimales(this.getTotalAnimales()+1);
	}
	public Anfibio(String nombre,int edad,String habitat,String genero, String colorPiel,boolean venenoso) {
		this.setColorPiel(colorPiel);
		this.setEdad(edad);
		this.setGenero(genero);
		this.setHabitat(habitat);
		this.setNombre(nombre);
		this.setVenenoso(venenoso);
		Anfibio.listado[Anfibio.listado.length] = this;
		this.setTotalAnimales(this.getTotalAnimales()+1);
	}
	
	
	public Anfibio[] getListado() {
		return listado;
	}
	public void setListado(Anfibio[] listado) {
		this.listado = listado;
	}
	public String getColorPiel() {
		return colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	public static Anfibio crearSalamandra(String nombre,int edad,String genero) {
		Anfibio.salamandras=+1;
		return(new Anfibio(nombre,edad,"selva",genero, "negro y amarillo",false));
	}
	public static Anfibio crearRana(String nombre,int edad,String genero) {
		
		Anfibio.ranas=+1;
		return(new Anfibio(nombre,edad,"selva",genero, "rojo",true));
	}
	public int cantidadAnfibios() {
		return (Anfibio.ranas + Anfibio.salamandras);
	}
	public String movimiento() {
		return("saltar");
	}


}
