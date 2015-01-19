package pd_efp.biblioteca;

public class Usuario {
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	
	public Usuario (String nombre, String apellido1, String apellido2, String dni){
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "Usuario: " + this.getNombre() + 
				"  "+ this.getApellido1() + 
				" " + this.getApellido2() + 
				" " + this.getDni() +"\n";
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	

}
