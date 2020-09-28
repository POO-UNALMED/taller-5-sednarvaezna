package zooAnimales;


public class Reptil extends Animal{
	public static Reptil[] listado;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		this.setListado(this);
		this.setTotalAnimales(this.getTotalAnimales()+1);
	}
	
	public Reptil(String nombre,int edad,String habitat,String genero, String colorEscamas, int largoCola) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setColorEscamas(colorEscamas);
		this.setLargoCola(largoCola);
		this.setGenero(genero);
		this.setListado(this);
		this.setTotalAnimales(this.getTotalAnimales()+1);

	}
	public Reptil[] getListado() {
		return listado;
	}
	public void setListado(Reptil listado) {
		if (Reptil.listado ==null) {
			Reptil.listado = new Reptil[1];
			Reptil.listado[0]=listado;
		}
		else {
			Reptil[] oldReptil = new Reptil[Reptil.listado.length];
			for (int i=0;i<Reptil.listado.length;i++) {
				oldReptil[i]=Reptil.listado[i];
			}
			
			Reptil.listado = new Reptil[Reptil.listado.length + 1];
					
			for (int i=0;i<oldReptil.length;i++) {
				Reptil.listado[i]=oldReptil[i];
			
				Reptil.listado[Reptil.listado.length-1]=listado;
			}
		}	
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getLargoCola() {
		return largoCola;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	
	public static int getIguanas() {
		return iguanas;
	}

	public static void setIguanas(int iguanas) {
		Reptil.iguanas = iguanas;
	}

	public static int getSerpientes() {
		return serpientes;
	}

	public static void setSerpientes(int serpientes) {
		Reptil.serpientes = serpientes;
	}
	
	
	public static Reptil crearIguana(String nombre,int edad,String genero) {
		Reptil.iguanas=+1;
		return(new Reptil(nombre,edad,"humedal",genero, "verde",3));
	}
	public static Reptil crearSerpiente(String nombre,int edad,String genero) {
		Reptil.serpientes=+1;
		return(new Reptil(nombre,edad,"jungla",genero, "blanco",1));
	}
	public int cantidadReptiles() {
		return (Reptil.serpientes + Reptil.iguanas);
	}
	public String movimiento() {
		return("reptar");
	}

	
}
