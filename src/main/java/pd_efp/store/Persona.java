package pd_efp.store;

public class Persona {
	private String nombre;

	private int edad;

	private long telefono;

	public Persona(String nombre, int edad, long telefono) {
		this.nombre = nombre;
		this.edad = edad;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public String toString() {
		return "Nombre: " + this.getNombre() + "\nEdad: " + this.getEdad()
				+ "\nTeléfono: " + this.getTelefono();
	}

}
