package pd_efp.Store;

import java.util.HashMap;

import java.util.Map;

public class Store {
	public enum tipo {
		RED, LOCAL
	};
	//private static Store 
	private static tipo lugarAlmacenamiento =null;
	private Map<String, Object> references;
	private Net almacen1; 
	private Local almacen2;
	// Valores posibles: "red", "local"
	public Store(String type) {
		if(lugarAlmacenamiento==null){
			this.references = new HashMap<String, Object>();
			if(type == "red"){
				lugarAlmacenamiento = tipo.RED;
				almacen1 = new Net();
			}
			if(type == "local"){
				lugarAlmacenamiento = tipo.LOCAL;
				almacen2 = new Local();
			}
		}
	}

	// Se almacena un objeto
	public void write(String key, Object value) {
		this.references.put(key, value);
		if(lugarAlmacenamiento ==tipo.RED){
			almacen1.write(key, value);
		}
		if(lugarAlmacenamiento ==tipo.LOCAL){
			almacen2.keep(key, value);
		}
	}

	// Se lee un objeto
	public Object read(String key) {
		if(references.get(key)!= null){
			if(lugarAlmacenamiento ==tipo.RED){
				return almacen1.read(key) + " " + references.get(key);
			}
			if(lugarAlmacenamiento ==tipo.LOCAL){
				return almacen2.find(key) + " " + references.get(key) ;
			}
		}
		return null;
	}

}
