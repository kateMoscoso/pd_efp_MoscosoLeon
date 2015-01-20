package pd_efp.calculadora;



public class ComandoIniciar implements Comando{

	//private Calculadora calculadora;
	public ComandoIniciar(Calculadora calc)  {
		super();
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "iniciar";
	}

	@Override
	public void execute() {
		calculadora.iniciar();
		
	}
}
