package pd_efp.Store;

public class Store {
    public enum type {
        RED, LOCAL
    };

    // Valores posibles: "red", "local"
    public Store(String type) {
    }

    // Se almacena un objeto
    public void write(String key, Object value) {
    }

    // Se lee un objeto
    public Object read(String key) {
        return null;
    }

}
