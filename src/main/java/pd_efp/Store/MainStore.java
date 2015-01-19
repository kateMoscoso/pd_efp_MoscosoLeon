package pd_efp.Store;



public class MainStore {
	 public static void main(String[] args) {
		 	Persona p1 = new Persona("Katherin", 24, 684056548);
		 	Persona p2 = new Persona("Mariana", 26, 684776548);
		 	Persona p3 = new Persona("Mariana", 25, 674776548);
	        Store store = new Store("red");
	        store.write(p1.getNombre(), p1);
	        store.write(p2.getNombre(), p2);
	        store.read(p1.getNombre());
	        store = new Store("local");
	        store.write(p3.getNombre(), p3);
	        
	    }
}
