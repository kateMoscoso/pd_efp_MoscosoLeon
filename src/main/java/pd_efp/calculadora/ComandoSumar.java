package pd_efp.calculadora;

import upm.jbb.IO;

public class ComandoSumar implements Comando {


	public ComandoSumar(Calculadora calc)  {
		super();
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "suma";
	}

	@Override
	public void execute() {
		int numero = IO.in.readInt("Numero a sumar");
		calculadora.sumar(numero);
		
	}

}
