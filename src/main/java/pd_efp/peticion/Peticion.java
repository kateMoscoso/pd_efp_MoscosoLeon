package pd_efp.peticion;

public class Peticion {
	private PeticionLocal pLocal;
	private PeticionRed pRed;
	
	public Peticion (){
		this.pLocal = new PeticionLocal();
		this.pRed = new PeticionRed();
	}
	
	public void accion1(){
		this.pRed.peticion1();
	}
	public void accion2(){
		this.pRed.peticion2();
	}
	public void accion3(){
		this.pRed.peticion3();
	}
	public void accion4(){
		this.pLocal.local1();
	}
	public void accion5(){
		this.pLocal.local2();
	}

}
