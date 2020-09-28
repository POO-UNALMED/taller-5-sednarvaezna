package gestion;

public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private Zona[] zona;
	
	public Zoologico() {
		
	}
	public Zoologico(String nombre,String ubicacion) {
		this.nombre=nombre;
		this.ubicacion=ubicacion;
	}
	public int cantidadTotalAnimales() {
		int total=0;
		for (int i=0;i<zona.length;i++) {
			total = total + zona[i].cantidadAnimales();
		}
		return total;
	}
	public void agregarZonas(Zona zona) {
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
		}
		
		
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
	public Zona[] getZona() {
		return zona;
	}
	public void setZona(Zona[] zona) {
		this.zona = zona;
	}

}
