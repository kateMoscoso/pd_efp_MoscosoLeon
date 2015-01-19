package pd_efp.texto;



public class Texto extends FlyweigthCaracteres {

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
	public void borrar(Componente c) {
		listaCaracteres.remove(c);
		
	}

	@Override
	public String imprimir(boolean mayusculas) {
		//Iterator it = (Iterator) listaCaracteres.iterator();
		String texto ="";
		for(Componente c : listaCaracteres){
			texto +=c.imprimir(mayusculas);
		}
		return texto;
	}

	@Override
	public boolean esCaracter() {
		// TODO Auto-generated method stub
		return false;
	}

}
