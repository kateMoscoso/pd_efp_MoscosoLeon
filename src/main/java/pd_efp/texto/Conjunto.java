package pd_efp.texto;

/**
 * Clase para parrafos y textos
 */
import java.util.ArrayList;
import java.util.List;


public  abstract class Conjunto extends Componente{
	protected List<Componente> conjuntoCaracteres ;

	 public Conjunto() {
		this.conjuntoCaracteres = new ArrayList<Componente>();
	}
	public void add(Componente c){
		if(c!= null){
			this.conjuntoCaracteres.add(c);
		}
	}

	@Override
	public abstract String dibujar(boolean mayusculas);
	@Override
	public boolean esCaracter() {
		return false;
	}

}
