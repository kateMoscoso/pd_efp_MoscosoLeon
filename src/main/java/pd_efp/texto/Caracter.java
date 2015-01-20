package pd_efp.texto;

public class Caracter  extends Componente{

	private char c;
	public Caracter(char c){
		this.c = c;
	}
	@Override
	public void add(Componente c) {
		//si se pretende añadir otro componete a caracte debe ignorarse
		
	}

	@Override
	public String dibujar(boolean mayusculas) {
		if(mayusculas)
			return (this.c +"").toUpperCase();
		return this.c+"";
	}
	@Override
	public boolean esCaracter() {
		return true;
	}

}
