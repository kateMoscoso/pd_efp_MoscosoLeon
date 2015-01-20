package pd_efp.texto;

/**
 * @author Katherin Moscoso León
 */
import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {
	private Map<Character, Caracter> caracteres= new HashMap<Character, Caracter>();
	private static FactoriaCaracter factoria =
			null;
	private FactoriaCaracter(){}

	public static FactoriaCaracter getFactoria(){
		if (FactoriaCaracter.factoria == null) {	
			FactoriaCaracter.factoria = new FactoriaCaracter();
			}
		return FactoriaCaracter.factoria;
	}
	public Caracter get(char caracter){
		Caracter resultado = null;
		if(this.caracteres.containsKey(caracter)){
			resultado = this.caracteres.get(caracter);
		}else if(!this.caracteres.containsKey(caracter)){
			resultado = new Caracter(caracter);
			this.caracteres.put(caracter, resultado);
		}else{
			assert false;
		}
		return resultado;
	} 

}
