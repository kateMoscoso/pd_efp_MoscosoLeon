package pd_efp.biblioteca;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Biblioteca {
	public Date fechaInicial = new Date();
	public void prestarLibro(LibroBiblioteca libro, Usuario usuario){
		/*Date fecha = new Date();
		Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        formateador.format(ahora);
		System.out.println (fecha);
		System.out.println (formateador.format(ahora));
		Calendar cal = new GregorianCalendar();
        cal.setTimeInMillis(fecha.getTime());
        cal.add(Calendar.DATE, 15);
        Date fechaFin =new Date(cal.getTimeInMillis());
        System.out.println (formateador.format(fechaFin)  );
        
        *Mostrar datos del libro
        *Conocer si un libro está libre o prestado
	Ver todos los libros prestados
	Prestar/devolver un libro*/
		
	}
	
	public static void main (String[] args){
		GestorUsuarios usuarios = new GestorUsuarios();
		Usuario u1= new Usuario("pepe", "López", "Garcia", "02575619D");
		Usuario u2= new Usuario("Ricardo", "Perez", "Garcia", "50575619D");
		GestorLibrosBiblioteca libros = new GestorLibrosBiblioteca();
		LibroBiblioteca l1 = new LibroBiblioteca("9788427202122", "Juegos del hambre", "Suzanne Collins");
		LibroBiblioteca l2 = new LibroBiblioteca("9788427200647", "El nombre del viento", "Patrick Rothfuss");
		usuarios.addUsuario(u1);
		usuarios.addUsuario(u2);
		libros.addLibroBiblioteca(l1);
		libros.addLibroBiblioteca(l2);
		System.out.println("Los usuario que se tienen actualmente son: \n" +usuarios.obtenerUsuario());
		System.out.println("Los libros que se tienen actualmente son: \n" +libros.obtenerLibros());
		usuarios.obtenerUsuario();
		
        
	}

}
