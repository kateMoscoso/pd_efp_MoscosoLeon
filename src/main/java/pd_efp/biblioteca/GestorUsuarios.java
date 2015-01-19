package pd_efp.biblioteca;

import java.util.HashMap;
import java.util.Map;

public class GestorUsuarios {
Map<String, Usuario> usuarios = new HashMap<String, Usuario>();
	
	public void addUsuario(Usuario usuario){
		usuarios.put(usuario.getDni(), usuario);
	}
	public String obtenerUsuario(){
		return usuarios.toString();
	}
	public void eliminarUsuario(Usuario usuario){
		usuarios.remove(usuario.getDni());
	}
	


}
