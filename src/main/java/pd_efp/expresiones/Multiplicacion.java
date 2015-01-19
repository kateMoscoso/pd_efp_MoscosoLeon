package pd_efp.expresiones;

public class Multiplicacion extends Expresion {
	private Expresion exp1, exp2;
	public Multiplicacion (Expresion exp1, Expresion exp2){
		this.exp1 = exp1;
		this.exp2 = exp2;
	}
	@Override
	public String toString() {
		return " ( " + this.exp1.toString() + " * " + this.exp2.toString() + ")";
	}
	@Override
	public int operar() {
		// TODO Auto-generated method stub
		return this.exp1.operar() * this.exp2.operar();
	}
}
