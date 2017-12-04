package modellayer;

import java.util.*;
public class Action {
    private ArrayList<ActionLine> pList;
    private double salePrice;
    
    public Action(int amount, Product product) {
        pList = new ArrayList<>();
        pList.add(new ActionLine(amount, product)); 
        calcSalePrice();
    }
 
    public String actionPrint() {
        String output = "";
        for(ActionLine actionLine : pList) {
            output += "       " + actionLine.getPrice() + ": (" + actionLine.getAmount() + ")" + actionLine.getName() +"\n"; 
        }
        return output;
    }
    
    public double calcSalePrice() {
        for(ActionLine actionline : pList) {
            salePrice += actionline.getPrice();   
        }
        return salePrice;
    }   
    
    public void addActionLine(int amount, Product newProduct) {
        for(ActionLine actionLine : pList) {
            if(actionLine.getProduct().getName().equals(newProduct.getName())) { 
                actionLine.setAmount(amount);
                calcSalePrice();                
            }else
                pList.add(new ActionLine(amount, newProduct));  
        }
    }
}