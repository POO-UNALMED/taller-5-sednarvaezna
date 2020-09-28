package zooAnimales;


public class Pez extends Animal{
	private static Pez[] listado;
	private static int salmones;
	private static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {
		Pez.listado[Pez.listado.length] = this;
		this.setTotalAnimales(this.getTotalAnimales()+1);
		
	}
	public Pez(String nombre,int edad,String habitat,String genero, String colorEscamas,int cantidadAletas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.setColorEscamas(colorEscamas);
		this.setCantidadAletas(cantidadAletas);
		Pez.listado[Pez.listado.length] = this;
		this.setTotalAnimales(this.getTotalAnimales()+1);
	}
	
	public Pez[] getListado() {
		return listado;
	}
	public void setListado(Pez[] listado) {
		this.listado = listado;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	
	public Pez crearBacalao(String nombre,int edad,String genero) {
		
		Pez.bacalaos=+1;
		return(new Pez(nombre,edad,"oceano",genero, "gris",6));
	}
	public Pez crearSalmon(String nombre,int edad,String genero) {
		Pez.salmones=+1;
		return(new Pez(nombre,edad,"oceano",genero, "rojo",6));
	}
	public int cantidadPeces() {
		return (Pez.bacalaos + Pez.salmones);
	}
	
	public String movimiento() {
		return("nadar");
	}
	
	
}
