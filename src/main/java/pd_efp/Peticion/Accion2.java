package pd_efp.Peticion;

public class Accion2 implements Accion {
private PeticionRed peticion;
	
	public Accion2(PeticionRed peticion){
		this.peticion = peticion;
	}
	@Override
	public void ejecutar() {
		this.peticion.peticion2();
		
	}
}
