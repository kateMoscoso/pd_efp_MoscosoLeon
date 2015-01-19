package pd_efp.biblioteca;

import java.util.HashMap;
import java.util.Map;

public class GestorLibrosBiblioteca {
	Map<String, LibroBiblioteca> libros = new HashMap<String, LibroBiblioteca>();
	
	public void addLibroBiblioteca(LibroBiblioteca libro){
		libros.put(libro.getISBN(), libro);
	}
	public String obtenerLibros(){
		return libros.toString();
	}
	
	public void obtenerLibro(String ISBN){
		libros.get(ISBN).toString();
	}
	public void eliminarLibro(LibroBiblioteca libro){
		libros.remove(libro.getISBN());
	}
	

}
