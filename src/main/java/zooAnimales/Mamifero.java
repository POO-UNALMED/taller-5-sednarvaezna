package zooAnimales;

public class Mamifero extends Animal{
	public static Mamifero[] listado;
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	
	public Mamifero() {
		this.setListado(this);
		this.setTotalAnimales(this.getTotalAnimales()+1);
	}
	
	public Mamifero(String nombre,int edad,String habitat,String genero,boolean pelaje,int patas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.setPelaje(pelaje);
		this.setPatas(patas);
		this.setListado(this);
		this.setTotalAnimales(this.getTotalAnimales()+1);
		
	}
	
	public Mamifero[] getListado() {
		return listado;
	}
	public void setListado(Mamifero listado) {
		if (Mamifero.listado ==null) {
			Mamifero.listado = new Mamifero[1];
			Mamifero.listado[0]=listado;
		}
		else {
			Mamifero[] oldMamifero = new Mamifero[Mamifero.listado.length];
			for (int i=0;i<Mamifero.listado.length;i++) {
				oldMamifero[i]=Mamifero.listado[i];
			}
			
			Mamifero.listado = new Mamifero[Mamifero.listado.length + 1];
					
			for (int i=0;i<oldMamifero.length;i++) {
				Mamifero.listado[i]=oldMamifero[i];
			
				Mamifero.listado[Mamifero.listado.length-1]=listado;
			}
		}	}
	public boolean isPelaje() {
		return pelaje;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public static Mamifero crearLeon(String nombre,int edad,String genero) {
		Mamifero.leones=+1;
		return(new Mamifero(nombre,edad,"selva",genero, true,4));
	}
	public static Mamifero crearCaballo(String nombre,int edad,String genero) {
		Mamifero.caballos=+1;
		return(new Mamifero(nombre,edad,"pradera",genero, true,4));
	}
	public int cantidadMamiferos() {
		return (Mamifero.leones + Mamifero.caballos	);
	}
	
	
}
