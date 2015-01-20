package pd_efp.biblioteca;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class Biblioteca {
	public Date fechaInicial = new Date();
	Map<String, Prestamo> prestamos = new HashMap<String, Prestamo>();
	public static GestorLibrosBiblioteca libros;
	public static GestorUsuarios usuarios;
	public void prestarLibro(LibroBiblioteca libro, Usuario usuario){
		if(!libro.estaPrestado()){
			Date fechaInicio = new Date();
			Calendar cal = new GregorianCalendar();
	        cal.setTimeInMillis(fechaInicio.getTime());
	        cal.add(Calendar.DATE, 15);
	        Date fechaFinal =new Date(cal.getTimeInMillis());
			
			Prestamo p = new Prestamo(libro, usuario, fechaInicio, fechaFinal);
			libro.setEstadoPrestado();
			prestamos.put(libro.getISBN(),p);
		}

		
	}
	public void devolverLibro(LibroBiblioteca libro){
		if(libro.estaPrestado()){
			libro.setEstadoNoPrestado();
			prestamos.remove(libro.getISBN());
		}
	}
	
	public static void main (String[] args){
		usuarios = new GestorUsuarios();
		Usuario u1= new Usuario("pepe", "López", "Garcia", "02575619D");
		Usuario u2= new Usuario("Ricardo", "Perez", "Garcia", "50575619D");
		libros = new GestorLibrosBiblioteca();
		LibroBiblioteca l1 = new LibroBiblioteca("9788427202122", "Juegos del hambre", "Suzanne Collins");
		LibroBiblioteca l2 = new LibroBiblioteca("9788427200647", "El nombre del viento", "Patrick Rothfuss");
		usuarios.addUsuario(u1);
		usuarios.addUsuario(u2);
		libros.addLibroBiblioteca(l1);
		libros.addLibroBiblioteca(l2);
		System.out.println("Los usuario que se tienen actualmente son: \n" +usuarios.obtenerUsuario());
		System.out.println("Los libros que se tienen actualmente son: \n" +libros.obtenerLibros());
		usuarios.obtenerUsuario();
		Biblioteca b = new Biblioteca();
		System.out.println("Los libros prestados son:");
		b.prestarLibro(l2, u1);
		b.prestarLibro(l1, u1);
		System.out.println(libros.obtenerLibrosPrestados());
		System.out.println(libros.obtenerLibro(l1.getISBN()));
		System.out.println("devolver: " );
		b.devolverLibro(l2);
		System.out.println("Los libros prestados son:");
		System.out.println(libros.obtenerLibrosPrestados());
		
        
	}

}
