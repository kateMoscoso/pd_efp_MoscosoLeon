package pd_efp.Peticion;

public class Accion4  implements Accion{
private PeticionLocal peticion;
	
	public Accion4(PeticionLocal peticion){
		this.peticion = peticion;
	}
	@Override
	public void ejecutar() {
		this.peticion.local1();;
		
	}
}
