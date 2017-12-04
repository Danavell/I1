package modellayer;
import java.util.*;

public class ProductContainer {
    private static ProductContainer instance = null;
    ArrayList<ProductLine> cont; 
    int index;
    private ProductContainer() {
        cont = new ArrayList<>();
        index = 0;
    }
    
    public static ProductContainer getInstance() {
        if(instance == null) {
            instance = new ProductContainer();
        }
        return instance;
    }

    public void addNewProductLine(ProductLine pL) {
        cont.add(pL);
    }
    
    public void deleteProductLine(ProductLine pL) {
        cont.remove(pL);
    }      
    
    public ArrayList<ProductLine> searchProductLine(String prefix) {
        ArrayList<ProductLine> matches = new ArrayList<>();

        for(ProductLine productLine : cont) {
            if(productLine.getKey().contains(prefix));
            matches.add(productLine);
        }
        return matches;
    }
    
    public void setStock(int index, int amount) {
        cont.get(index).changeStock(amount);
    }
}