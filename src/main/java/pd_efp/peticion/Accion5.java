package pd_efp.peticion;

public class Accion5 implements Accion {
private Peticion peticion;
	
	public Accion5(Peticion peticion){
		this.peticion = peticion;
	}
	@Override
	public void ejecutar() {
		this.peticion.accion5();
		
	}
}
