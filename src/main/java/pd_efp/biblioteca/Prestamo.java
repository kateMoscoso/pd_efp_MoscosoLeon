package pd_efp.biblioteca;

import java.util.Date;

public class Prestamo {
	private LibroBiblioteca libro;
	private Usuario usuario;
	private Date fechaInicio;
	private Date fechaFinal;
	public Prestamo (LibroBiblioteca libro, Usuario usuario, Date fechaInicio, Date fechaFinal){
		this.libro = libro;
		this.libro.setEstadoPrestado();
		this.usuario = usuario;
		this.fechaInicio = fechaInicio;
		this.fechaFinal = fechaFinal;
	}
	public LibroBiblioteca getLibro() {
		return libro;
	}
	public void setLibro(LibroBiblioteca libro) {
		this.libro = libro;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFinal() {
		return fechaFinal;
	}
	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

}
