package pd_efp.calculadora;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class GestorMementos {
	private SortedMap<String, MementoCalculadora> lista = new TreeMap<String, MementoCalculadora>();

	public void addMemento(String key, MementoCalculadora memento) {
		this.lista.put(this.lista.size() + ":" + key, memento);
	}
	public MementoCalculadora getMemento(String key) {
		return this.lista.get(key);
	}
	public String[] keys() {
		return this.lista.keySet().toArray(new String[0]);
	}
}
