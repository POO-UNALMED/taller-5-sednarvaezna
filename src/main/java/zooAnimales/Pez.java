package zooAnimales;


public class Pez extends Animal{
	public static Pez[] listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {
		this.setListado(this);
		this.setTotalAnimales(this.getTotalAnimales()+1);
		
	}
	public Pez(String nombre,int edad,String habitat,String genero, String colorEscamas,int cantidadAletas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.setColorEscamas(colorEscamas);
		this.setCantidadAletas(cantidadAletas);
		this.setListado(this);
		this.setTotalAnimales(this.getTotalAnimales()+1);
	}
	
	public Pez[] getListado() {
		return listado;
	}
	public void setListado(Pez listado) {
		if (Pez.listado ==null) {
			Pez.listado = new Pez[1];
			Pez.listado[0]=listado;
		}
		else {
			Pez[] oldPez = new Pez[Pez.listado.length];
			for (int i=0;i<Pez.listado.length;i++) {
				oldPez[i]=Pez.listado[i];
			}
			
			Pez.listado = new Pez[Pez.listado.length + 1];
					
			for (int i=0;i<oldPez.length;i++) {
				Pez.listado[i]=oldPez[i];
			
				Pez.listado[Pez.listado.length-1]=listado;
			}
		}	
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
	
	public static  Pez crearBacalao(String nombre,int edad,String genero) {
		
		Pez.bacalaos=+1;
		return(new Pez(nombre,edad,"oceano",genero, "gris",6));
	}
	public static Pez crearSalmon(String nombre,int edad,String genero) {
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
