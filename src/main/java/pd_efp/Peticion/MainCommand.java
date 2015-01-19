package pd_efp.Peticion;



public class MainCommand {
	
	    
	    public static void main(String[] args) {
	    	Accion accion1, accion2, accion3, accion4, accion5;
	    	PeticionLocal p1 = new PeticionLocal();
	        PeticionRed p2 = new PeticionRed();
	        accion1 = new Accion1(p2);
	        accion2 = new Accion2(p2);
	        accion3 = new Accion3(p2);
	        accion4 = new Accion4(p1);
	        accion5 = new Accion5(p1);
	    	accion1.ejecutar();
	    	accion2.ejecutar();
	    	accion3.ejecutar();
	    	accion4.ejecutar();
	    	accion5.ejecutar();
	        
	    }
}
