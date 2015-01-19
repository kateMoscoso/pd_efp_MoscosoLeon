package pd_efp.biblioteca;

public abstract class Libro {
	private String ISBN;
	private String titulo;
	private String autor;
	
	public Libro (String ISBN, String titulo, String autor){
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.autor = autor;
	}

	public abstract String toString();
	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}


}
