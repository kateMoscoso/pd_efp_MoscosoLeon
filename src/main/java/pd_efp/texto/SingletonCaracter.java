package pd_efp.texto;


public final class SingletonCaracter {
	private static SingletonCaracter singleton = null;
	private HashMap<Character, Caracter> mapa = new HashMap<Character, Caracter>();
	private  SingletonCaracter(){}
	public static SingletonCaracter getSingleton() {
		if (SingletonCaracter.singleton == null) {
			SingletonCaracter.singleton = new SingletonCaracter();
		}
		return SingletonCaracter.singleton;
	}
	public Caracter get(char caracter) {
		if (!mapa.containsKey(caracter))
		mapa.put(new Character(caracter), new Caracter(caracter));
		return mapa.get(caracter);
		}


}
