package src;


public class Restoran {

	public long id;
	public String nombre;
	
	public Restoran(String nombre) {

		this.nombre = nombre;
		
	}
	
	public Restoran(long id,String nombre) {
		this.id = id;
		this.nombre = nombre;
		
	}
	
	public String toString() {
	      return this.nombre ;
	   }
}
