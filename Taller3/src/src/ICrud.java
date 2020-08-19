package src;

import java.util.ArrayList;

public interface ICrud <T>{

	void add(T t);
	void delete(long id);
	ArrayList<T> getList();
	long getId();
	String getNombre();
	void setNombre(String nombre);
}
