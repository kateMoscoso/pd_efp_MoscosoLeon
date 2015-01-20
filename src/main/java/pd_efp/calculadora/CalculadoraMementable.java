package pd_efp.calculadora;

public interface CalculadoraMementable <T> {
	MementoCalculadora createMemento();
	void restoreMemento(MementoCalculadora memento);
}
 /**
  * public class CalculadoraMementable extends Calculadora implements Mementable {
@Override
public MementoCalculadora createMemento() {
return new MementoCalculadora(this.getTotal());
}
@Override
public void restoreMemento(MementoCalculadora memento) {
this.setTotal(memento.getValor());
}




public interface Mementable {

}

public class MementoCalculadora {
private int valor;
public MementoCalculadora(int total) {
this.valor=total;
}
public int getValor(){
return valor;
}
  */
