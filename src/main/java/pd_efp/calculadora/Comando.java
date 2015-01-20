package pd_efp.calculadora;

public interface Comando {

	public Calculadora calculadora = new Calculadora();
	public String name();
	public void execute();

}
