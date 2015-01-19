package pd_efp.store;

import upm.jbb.IO;

public class MainStore {
	public static void main(String[] args) {
		Persona p1 = new Persona("Katherin", 24, 684056548);
		Persona p2 = new Persona("Mariana", 26, 684776548);
		Persona p3 = new Persona("Carlos", 25, 674776548);
		Store store = new Store("red");
		store.write(p1.getNombre(), p1);
		store.write(p2.getNombre(), p2);
		System.out.println(store.read(p1.getNombre()));
		try {
			store = new Store("local");
		}catch(Exception e) { 
			
			System.out.println("Se ha producido un error intentando asignar nuevo sitio");
		}
		Store store2 = new Store("red");
		store2.write(p3.getNombre(), p3);

	}
}
