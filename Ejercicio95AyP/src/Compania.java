import java.util.*;
public class Compania {

	//atributos
	private String nombre;
	private String direccion;
	private String ciudad;
	private String director;
	private static double[] ventas= new double[12];
	private static int totalVentas=0;
	
	// constructores
	Compania(String nom, String direc, String city, String jefe){
		this.nombre= nom;
		this.direccion = direc;
		this.ciudad = city;
		this.director = jefe;
	
		
		
	}
	 Compania(){
		 this.ventas= ventas;
		 
	 }
	 
	 //Gets and Sets
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public double[] getVentas() {
			return ventas;
		}
		
	public void setVentas(double[] ventas) {
		this.ventas = ventas;
	}
	public static int getTotalVentas() {
		return totalVentas;
	}
	public static void setTotalVentas(int totalVentas) {
		Compania.totalVentas = totalVentas;
	}
	 
	//fun min

	//toString
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Director: "+ director+ "\n");
		sb.append("Direccion: "+ direccion+ "\n");
		sb.append("Ciudad: "+ ciudad+ "\n");
		sb.append("Nombre: "+ nombre+ "\n");
		return sb.toString();
	}
	// equals
	
	//compareto
	
	
	//fun clase
	public static void ventaMes(int mes, double quant) {
		totalVentas++;
		ventas[mes]=quant;
	}
	
	
	public static int mesMayor() {
		double mayorVta;
		mayorVta=0;
		int mayor=0;
		for (int i =0; i<12; i++) {
			if(ventas[i]>mayorVta) {
				mayorVta=ventas[i];
				mayor=i+1; //esto es para que el mes 1 sea enero y el 12 diciembre
			}
		}
		return mayor;
	}
	
	public static int mesMenor() {
		double menorVta;
		menorVta=0;
		int menor=0;
		for (int i =0; i<12; i++) {
			if(i==0) {
				menorVta=ventas[i];
				menor=i+1; //esto es para que el mes 1 sea enero y el 12 diciembre
			}
			if(ventas[i]<menorVta) {
				menorVta=ventas[i];
				menor=i+1; //esto es para que el mes 1 sea enero y el 12 diciembre
			}
		}
		return menor;
	}
	
	public static double totalVta() {
		double ventaTot=0;
		for (int i=0; i<totalVentas; i++ ) {
			ventaTot+=ventas[i];
		}
		return ventaTot;
	}
	
	public static double promedio() {
		double totDouble= totalVentas*1.0;
		double promedio=(Compania.totalVta()/totDouble);
		return promedio;
	}
	
	public static int arribaPromedio() {
		int arriba=0;
		for (int i=0; i<totalVentas; i++) {
		if (ventas[i]>Compania.promedio()) {
			arriba++;
		}
		}
		return arriba;
	}
	
	public static double getUnaVenta(int mes) {
		return ventas[mes];
	}
	
	 
//	-nombre:String
//	-direccion:String
//	-ciudad:String
//	-director:String
//	-ventas: [] double
//	-totalVentas: int
}
