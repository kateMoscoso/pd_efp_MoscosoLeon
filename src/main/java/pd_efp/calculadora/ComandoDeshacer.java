package pd_efp.calculadora;

import upm.jbb.IO;

public class ComandoDeshacer implements Comando {
	
	public ComandoDeshacer(Calculadora calculadora) {
		super();
		}
	@Override
	public String name() {
	return "Deshacer";
	}

	@Override
	public void execute() {
		  o.restoreMemento(
				  gestorMementos.getMemento((String) IO.in.select(
						  gestorMementos.keys(), "Restaurar")));
		   
		
	}
}
