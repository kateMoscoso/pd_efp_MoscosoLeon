package pd_efp.store;

public class Local {
	public void keep(String key, Object value) {
		// Se escribe en red
		System.out.println("Local:keep");
	}

	public Object find(String key) {
		// Se lee de red
		return ("Local:find");
	}

}
