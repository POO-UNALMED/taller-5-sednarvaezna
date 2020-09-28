package gestion;

import java.util.ArrayList;

public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private ArrayList <Zona> zona;
	
	public Zoologico() {
		
	}
	public Zoologico(String nombre,String ubicacion) {
		this.nombre=nombre;
		this.ubicacion=ubicacion;
	}
	public int cantidadTotalAnimales() {
		int total=0;
		for (int i=0;i<this.zona.size();i++) {
			total = total + this.zona.get(i).cantidadAnimales();
		}
		return total;
	}
	public void agregarZonas(Zona zona) {
		this.zona.add(zona);
		/*
		if (this.zona ==null) {
			this.zona = new Zona[1];
			this.zona[0]=zona;
		}
		else {
			Zona[] oldZona = new Zona[this.zona.length];
			for (int i=0;i<this.zona.length;i++) {
				oldZona[i]=this.zona[i];
			}
			
			this.zona = new Zona[this.zona.length + 1];
					
			for (int i=0;i<oldZona.length;i++) {
				this.zona[i]=oldZona[i];
			
			this.zona[this.zona.length-1]=zona;
			}
		}*/
		
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public ArrayList getZona() {
		
		return zona;
	}
	public void setZona(ArrayList zona) {
		this.zona = zona;
	}

}
