package pd_efp.peticion;

public class Accion2 implements Accion {
private Peticion peticion;
	
	public Accion2(Peticion peticion){
		this.peticion = peticion;
	}
	@Override
	public void ejecutar() {
		this.peticion.accion2();
		
	}
}
