package pd_efp.calculadora;

import upm.jbb.IO;

public class ComandoImprimir implements Comando {

	public ComandoImprimir(Calculadora calc)  {
		super();
	}


	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "imprimir";
	}

	@Override
	public void execute() {
		IO.out.println(calculadora.getTotal());
		
	}

}
