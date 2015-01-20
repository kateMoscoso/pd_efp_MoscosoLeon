package pd_efp.peticion;

public class Accion3 implements Accion {
private Peticion peticion;
	
	public Accion3(Peticion peticion){
		this.peticion = peticion;
	}
	@Override
	public void ejecutar() {
		this.peticion.accion3();
		
	}
}
