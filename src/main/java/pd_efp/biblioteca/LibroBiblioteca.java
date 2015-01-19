package pd_efp.biblioteca;



public class LibroBiblioteca extends Libro {
	private Estado estado;
	public enum Estado { Prestado, noPrestado}
	public LibroBiblioteca (String ISBN, String titulo, String autor){
		super(ISBN, titulo, autor);
		this.estado = Estado.noPrestado;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Libro: " + this.getTitulo() + 
				"del autor: "+ this.getAutor() + 
				"con ISBN: " + this.getISBN()  + "\n";
	}
	public boolean estaPrestado() {
		return this.estado == Estado.Prestado;
	}
	public void setEstadoPrestado() {
		this.estado = Estado.Prestado;
	}
	public void setEstadoNoPrestado() {
		this.estado = Estado.noPrestado;
	}
}
