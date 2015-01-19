package pd_efp.Peticion;

public class Accion5 implements Accion {
private PeticionLocal peticion;
	
	public Accion5(PeticionLocal peticion){
		this.peticion = peticion;
	}
	@Override
	public void ejecutar() {
		this.peticion.local2();;
		
	}
}
