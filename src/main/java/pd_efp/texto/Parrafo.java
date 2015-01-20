package pd_efp.texto;

/**
 * parrado conjunto de carcateres
 * @author Katherin Moscoso
 *
 */
public class Parrafo extends Conjunto {

	@Override
	public void add(Componente c) {
		if(c.esCaracter()){
			conjuntoCaracteres.add(c);
		}	
		else {
			throw new UnsupportedOperationException("No se pueden añadir elementos que no sean un caracter");
		}
	}

	@Override
	public String dibujar(boolean mayusculas) {
		String texto ="";
		for(Componente c : conjuntoCaracteres){
			texto +=c.dibujar(mayusculas);
		}
		texto+="\n";
		return texto;
	}



}
