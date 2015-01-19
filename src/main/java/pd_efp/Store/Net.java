package pd_efp.Store;

public class Net {
    public void write(String key, Object value) {
        // Se escribe en red
        System.out.println("Net:write");
    }

    public Object read(String key) {
        // Se lee de red
        return ("Net:read");
    }

}
