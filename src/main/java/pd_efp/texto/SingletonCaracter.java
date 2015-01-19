package pd_efp.texto;


public final class SingletonCaracter {
	private static SingletonCaracter singleton = null;

	private  SingletonCaracter(){}
	public static SingletonCaracter getSingleton() {
		if (SingletonCaracter.singleton == null) {
			SingletonCaracter.singleton = new SingletonCaracter();
		}
		return SingletonCaracter.singleton;
	}

}
