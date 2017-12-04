package modellayer;

import java.util.ArrayList;
/**
 * Write a description of class ActionLine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ActionLine
{ 
    private int amount;
    private double actionLinePrice;
    private Product product;
    
    public ActionLine(int newAmount, Product prod)
    {
        amount = newAmount;
        product = prod;
        price();
    }    
    
    public double price() {
        actionLinePrice = amount * product.getPrice();
        return actionLinePrice;
    }
    
    public Product getProduct() {return product;}
    public double getPrice() {return actionLinePrice;}    
    public int getAmount() {return amount;}
    public String getName() {return product.getName();}
    public void setAmount(int a) {amount += a;}
}
