import java.util.HashMap;
import java.util.Scanner;

public class Catalog {
    private HashMap<Integer, Product> catalog;

    public Catalog(HashMap<Integer, Product> catalog) {
        this.catalog = catalog;
    }


    public HashMap<Integer, Product> getCatalog() {
        return catalog;
    }

    public void setCatalog(HashMap<Integer, Product> catalog) {
        this.catalog = catalog;
    }
}



