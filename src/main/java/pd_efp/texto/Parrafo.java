package pd_efp.texto;

public class Parrafo extends FlyweigthCaracteres {


	public Parrafo() {
		super();
	}
	@Override
	public void aniadir(Componente c) {
		if(c.esCaracter()){
			listaCaracteres.add(c);
		}	
		else {
			throw new UnsupportedOperationException("No se pueden añadir elementos que no sean un caracter");
		}

	}

	@Override
	public String imprimir(boolean mayusculas) {
		String texto ="";
		for(Componente c : listaCaracteres){
			texto +=c.imprimir(mayusculas);
		}
		return texto;
	}

	@Override
	public boolean esCaracter() {
		return false;
	}

	@Override
	public void borrar(Componente c) {
		listaCaracteres.remove(c);

	}

}
