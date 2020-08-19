package src;

import java.util.ArrayList;

public class Productos implements ICrud<Productos>{

	private long id;
	private String nombre;
	private long precio;
	public ArrayList<Productos> listaProductos;
	
	@Override
	public void add(Productos t) {
		listaProductos.add(t);
	}

	@Override
	public void delete(long id) {
		listaProductos.remove(id);
	}

	@Override
	public ArrayList<Productos> getList() {
		return listaProductos;
	}

	@Override
	public long getId() {
		return id;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
		
	}
}
