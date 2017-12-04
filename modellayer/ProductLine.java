package modellayer;


/**
 * Write a description of class ProductLine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProductLine
{
    private int stock;
    private Product product;
    private String key;
    private static int index;
    public ProductLine( int amount,Product prod) {
        stock = amount;
        product = prod;
        key();
        index++;
    }
    
    public String key() {
        String a = stock + "|" + product.getName() + "|" + product.getBarcode() + "|" + product.getPrice();
        key = a;
        return key.toLowerCase();
    }       

    public String getKey() {return key;}   
    public Product getProduct() {return product;} 
    public int getStock() {return stock;}
    public int getIndex() {return index;}
    
    public void changeStock(int s) {stock += s; key();}    
}
