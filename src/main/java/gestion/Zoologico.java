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
		this.zona[this.zona.length]=zona;
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
	public void agregarZonas(Zona[] zona) {
		for (int i = 0, j = this.zona.length; i<zona.length ;i++,j++) {
			this.zona[j] = zona[i];
		}
	}
}
