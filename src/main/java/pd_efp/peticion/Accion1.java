package pd_efp.peticion;

public class Accion1 implements Accion{

	private Peticion peticion;
	
	public Accion1(Peticion peticion){
		this.peticion = peticion;
	}
	@Override
	public void ejecutar() {
		this.peticion.accion1();
		
	}

}
