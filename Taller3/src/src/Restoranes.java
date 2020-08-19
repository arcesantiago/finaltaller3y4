package src;

import java.util.ArrayList;

public class Restoranes implements ICrud<Restoranes>{
	
	private long id;
	private String nombre;
	public ArrayList<Restoranes> listaRestoranes;
	
	
	public Restoranes(String nombre) {
		this.nombre = nombre;
		
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
	

	@Override
	public void add(Restoranes t) {
		listaRestoranes.add(t);
		
	}

	@Override
	public void delete(long id) {
		listaRestoranes.remove(id);
		
	}

	@Override
	public ArrayList<Restoranes> getList() {
			return listaRestoranes;
	}
}
