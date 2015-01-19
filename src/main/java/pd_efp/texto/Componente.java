package pd_efp.texto;

public abstract class Componente {

	public abstract void aniadir(Componente c);
	public abstract void borrar(Componente c);
	public abstract String imprimir(boolean mayusculas);
	public abstract boolean esCaracter();
}
