package cntrllayer;

import java.util.*;
import modellayer.*;
public class ProductController {    
    private ProductContainer cont;
    public ProductController() {
        
        cont = ProductContainer.getInstance();
    }

    public void create(int stock, String name, String barcode, double price) {
        cont.addNewProductLine(new ProductLine(stock,new Product(name, barcode, price)));  
    }

    public void delete(ProductLine productLine) {
        cont.deleteProductLine(productLine);
    }

    public void update(ProductLine oldPL, int stock, String name, String barcode, double price) {
        cont.deleteProductLine(oldPL);
        cont.addNewProductLine(new ProductLine(stock,new Product(name, barcode, price)));        
    }
    
    public ArrayList<ProductLine> getSearchResults(String p) {
        ArrayList<ProductLine> matches = cont.searchProductLine(p); 
        return matches;
    }

    public String getSearchString(String p) {
        ArrayList<ProductLine> matches = cont.searchProductLine(p);
        String output = "";
        int i = 1;
        for (ProductLine productLine : matches) {
            output += i + ".\n" + "Name: " + productLine.getProduct().getName() + "\n"
                    + "Quantity: " + productLine.getStock() + "\n"
                    + "Price: " + productLine.getProduct().getPrice() + "\n"  
                    + "===========\n";
            i++;
        }
        return output;
    }
    
    public void changeStock(int index, int amount) {
        cont.setStock(index, amount);
    }
}    