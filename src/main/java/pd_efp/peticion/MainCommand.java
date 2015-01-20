package pd_efp.peticion;



public class MainCommand {
	
	    
	    public static void main(String[] args) {
	    	Peticion p = new Peticion();
	    	Accion accion1, accion2, accion3, accion4, accion5;
	    	
	        accion1 = new Accion1(p);
	        accion2 = new Accion2(p);
	        accion3 = new Accion3(p);
	        accion4 = new Accion4(p);
	        accion5 = new Accion5(p);
	    	accion1.ejecutar();
	    	accion2.ejecutar();
	    	accion3.ejecutar();
	    	accion4.ejecutar();
	    	accion5.ejecutar();
	        
	    }
}
