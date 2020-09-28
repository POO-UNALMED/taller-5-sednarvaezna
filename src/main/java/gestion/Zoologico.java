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
		for (int i=0;i<zonas.length;i++) {
			total = total + zonas[i].cantidadAnimales();
		}
		return total;
	}
	public void agregarZonas(Zona zona) {
		this.zonas[this.zonas.length]=zona;
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
		return zonas;
	}
	public void setZona(Zona[] zonas) {
		this.zonas = zonas;
	}
	public void agregarZonas(Zona[] zona) {
		for (int i = 0, j = this.zonas.length; i<zona.length ;i++,j++) {
			this.zonas[j] = zona[i];
		}
	}
}
