import java.util.HashMap;

public class Catalog {
    private HashMap<Integer, Product> catalog;
    private static boolean isCatalog = false;

    public Catalog(HashMap<Integer, Product> catalog) {
        isCatalog = true;
        this.catalog = catalog;
    }

    public static boolean isCatalog() {
        return isCatalog;
    }


    public HashMap<Integer, Product> getCatalog() {
        return catalog;
    }

    public void setCatalog(HashMap<Integer, Product> catalog) {
        this.catalog = catalog;
    }
}



