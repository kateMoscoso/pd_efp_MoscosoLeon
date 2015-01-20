package pd_efp.texto;


/***
 * Conjunto de parrafos u otros textos
 * @author Katheri Moscoso León
 *
 */
public class Texto extends Conjunto {

	@Override
	public void add(Componente c) {
		if(!c.esCaracter()){
			conjuntoCaracteres.add(c);
		}	
		else {
			throw new UnsupportedOperationException("No se pueden añadir elementos que sean un caracter");
		}
	}


	@Override
	public String dibujar(boolean mayusculas) {
		String texto ="";
		for(Componente c : conjuntoCaracteres){
			texto +=c.dibujar(mayusculas);
		}
		texto+="---o---\n";
		return texto;
	}


}
