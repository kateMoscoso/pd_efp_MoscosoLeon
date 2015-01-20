package pd_efp.peticion;

import org.junit.Before;





public class PeticionTest {

	private Accion accion1, accion2, accion3, accion4, accion5;
	private Peticion p = new Peticion();

    @Before
    public void ini() {
    	
    	this.accion1 = new Accion1(p);
    	this.accion2 = new Accion2(p);
    	this.accion3 = new Accion3(p);
    	this.accion4 = new Accion4(p);
    	this.accion5 = new Accion5(p);
   }
}
