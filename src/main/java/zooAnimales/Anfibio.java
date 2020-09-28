package zooAnimales;

public class Anfibio extends Animal {
	public static Anfibio[] listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		this.setListado(this);
		this.setTotalAnimales(this.getTotalAnimales()+1);
	}
	public Anfibio(String nombre,int edad,String habitat,String genero, String colorPiel,boolean venenoso) {
		this.setColorPiel(colorPiel);
		this.setEdad(edad);
		this.setGenero(genero);
		this.setHabitat(habitat);
		this.setNombre(nombre);
		this.setVenenoso(venenoso);
		this.setListado(this);
		this.setTotalAnimales(this.getTotalAnimales()+1);
	}
	
	
	public Anfibio[] getListado() {
		return listado;
	}
	public void setListado(Anfibio listado) {
		if (Anfibio.listado ==null) {
			Anfibio.listado = new Anfibio[1];
			Anfibio.listado[0]=listado;
		}
		else {
			Anfibio[] oldAnfibio = new Anfibio[Anfibio.listado.length];
			for (int i=0;i<Anfibio.listado.length;i++) {
				oldAnfibio[i]=Anfibio.listado[i];
			}
			
			Anfibio.listado = new Anfibio[Anfibio.listado.length + 1];
					
			for (int i=0;i<oldAnfibio.length;i++) {
				Anfibio.listado[i]=oldAnfibio[i];
			
				Anfibio.listado[Anfibio.listado.length-1]=listado;
			}
		}
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
