package pd_efp.calculadora;

import upm.jbb.IO;

public class ComandoGuardar  implements Comando{
	

	public ComandoGuardar(Calculadora calculadora) {
		super();
	}

	@Override
	public String name() {
		return "Guardar";
	}



	@Override
	public void execute() {

		gestorMementos.addMemento(IO.in.readString("Titulo nuevo memento: "),
				o.createMemento());
	}
}
