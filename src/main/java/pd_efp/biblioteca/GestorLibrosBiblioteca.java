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

	public LibroBiblioteca obtenerLibro(String ISBN){
		if (libros.get(ISBN)!=null)
			return libros.get(ISBN);
		return null;
	}
	public void eliminarLibro(LibroBiblioteca libro){
		libros.remove(libro.getISBN());
	}
	
	public String obtenerLibrosPrestados(){
		String librosPrestados ="";
		for (LibroBiblioteca libro : libros.values()) {
			if(libro.estaPrestado()){
				librosPrestados += libro.toString();
			}
		}
		return librosPrestados;
	}

}
