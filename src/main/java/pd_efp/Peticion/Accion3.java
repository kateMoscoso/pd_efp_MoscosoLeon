package pd_efp.Peticion;

public class Accion3 implements Accion {
private PeticionRed peticion;
	
	public Accion3(PeticionRed peticion){
		this.peticion = peticion;
	}
	@Override
	public void ejecutar() {
		this.peticion.peticion3();
		
	}
}
