package pd_efp.texto;

import java.util.ArrayList;
import java.util.List;




public  abstract class FlyweigthCaracteres extends Componente{
	protected List<Componente> listaCaracteres ;

	 public FlyweigthCaracteres() {
		 
		this.listaCaracteres = new ArrayList<Componente>();
	}
	public abstract void aniadir(Componente c);

	public abstract void borrar(Componente c);
	@Override
	public abstract String imprimir(boolean mayusculas);
	@Override
	public boolean esCaracter() {
		// TODO Auto-generated method stub
		return false;
	}

}
