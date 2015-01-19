package pd_efp.Peticion;

public class Accion1 implements Accion{

	private PeticionRed peticion;
	
	public Accion1(PeticionRed peticion){
		this.peticion = peticion;
	}
	@Override
	public void ejecutar() {
		this.peticion.peticion1();
		
	}

}
