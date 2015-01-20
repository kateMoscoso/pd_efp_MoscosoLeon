package pd_efp.calculadora;

public interface Comando {

	public Calculadora calculadora = new Calculadora();
	public GestorMementos gestorMementos  = new GestorMementos();
    public Originador o = new Originador();
	public String name();
	public void execute();

}
