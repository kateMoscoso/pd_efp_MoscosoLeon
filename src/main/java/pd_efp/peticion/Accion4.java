package pd_efp.peticion;

public class Accion4  implements Accion{
private Peticion peticion;
	
	public Accion4(Peticion peticion){
		this.peticion = peticion;
	}
	@Override
	public void ejecutar() {
		this.peticion.accion4();;;
		
	}
}
