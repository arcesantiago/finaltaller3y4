package src;


public class Producto {

	public long id;
	public long idRestoran;
	public String nombre;
	public long precio;
	
	public Producto(long idRestoran, long id) {
		this.idRestoran = idRestoran;
		this.id = id;
	}
	
	public Producto(long idRestoran, String nombre,long precio) {
		this.idRestoran = idRestoran;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public Producto(long idRestoran,long id, String nombre,long precio) {
		this.idRestoran = idRestoran;
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}
}
