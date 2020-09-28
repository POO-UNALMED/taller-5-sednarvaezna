package zooAnimales;

import gestion.Zona;

public class Ave extends Animal{
	public static Ave[] listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave() {
		this.setListado(this);
		this.setTotalAnimales(this.getTotalAnimales()+1);
	}
	
	public Ave(String nombre,int edad,String habitat,String genero,String colorPlumas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.setColorPlumas(colorPlumas);
		this.setListado(this);
		this.setTotalAnimales(this.getTotalAnimales()+1);
	}
	
	public Ave[] getListado() {
		return listado;
	}
	public void setListado(Ave listado) {
		if (this.listado ==null) {
			this.listado = new Ave[1];
			this.listado[0]=listado;
		}
		else {
			Ave[] oldAve = new Ave[this.listado.length];
			for (int i=0;i<this.listado.length;i++) {
				oldAve[i]=this.listado[i];
			}
			
			this.listado = new Ave[this.listado.length + 1];
					
			for (int i=0;i<oldAve.length;i++) {
				this.listado[i]=oldAve[i];
			
			this.listado[this.listado.length-1]=listado;
			}
		}
	}
	public String getColorPlumas() {
		return colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	public static Ave crearHalcon(String nombre,int edad,String genero) {
		Ave.halcones=+1;
		return(new Ave(nombre,edad,"montanas",genero, "cafe glorioso"));
	}
	public static Ave crearAguila(String nombre,int edad,String genero) {
		Ave.aguilas=+1;
		return(new Ave(nombre,edad,"montanas",genero, "blanco y amarillo"));
	}
	public int cantidadAves() {
		return (Ave.aguilas + Ave.halcones);
	}
	public String movimiento() {
		return("volar");
	}
	
}
