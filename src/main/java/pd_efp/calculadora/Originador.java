package pd_efp.calculadora;

public class Originador extends Calculadora implements CalculadoraMementable<Calculadora> {


	private int id;
	
	public int getId(){
		return id;
	}
	
	@Override
	public MementoCalculadora createMemento() {
		return new MementoCalculadora(this.getTotal());
	}

	@Override
	public void restoreMemento(MementoCalculadora memento) {
		this.setTotal(memento.getTotal());
		
	}

}
