package pd_efp.calculadora;

import upm.jbb.IO;

public class ComandoRestar implements Comando {

	public ComandoRestar(Calculadora calc)  {
		super();
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "resta";
	}

	@Override
	public void execute() {
		int numero = IO.in.readInt("Numero a restar");
		calculadora.restar(numero);
		
	}

}
