package modellayer;


import java.util.*;
public class SaleContainer {
    private static SaleContainer instance = null;
    ArrayList<Sale> cont;
    private String key;
    private int currentIndex;
    
    public SaleContainer() {
        cont = new ArrayList<>();
    }
    
    public static SaleContainer getInstance() {
        if(instance == null) {
            instance = new SaleContainer();
        }
        return instance;
    }

    public int createAction(String employee, int amount, Product product) { 
        cont.add(new Sale(employee, amount, product));
        cont.trimToSize();
        currentIndex = cont.get(cont.size()-1).getSerial();
        return currentIndex--;
    }
    
    public void addCustomer(Customer cust) {
        cont.get(currentIndex).addCustomer(cust);
    }     
    
    public void addActionLine(int amount, Product product) {
        cont.get(currentIndex).addAL(amount, product);
    }    
    
    public double getRunningTotal() {
        double price = cont.get(currentIndex).getCSP(); return price;
    }
    
    public String getBill() {String bill = cont.get(currentIndex).bill(); return bill;}    
    
    public void setStatus(int status) {
        String output = "";
        if(status == -1) { output = "Billed";}
        else if(status == 0) {output = "Paid";}
        else output = "Reserved";
        cont.get(currentIndex).setStatus(output);
    }
}