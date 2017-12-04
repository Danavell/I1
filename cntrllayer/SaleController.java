package cntrllayer;

import java.util.*;
import modellayer.*;
public class SaleController
{
    private CustomerController cCntrl;
    private ProductController pCntrl;
    private SaleContainer cont;
    private String employee;
    private ArrayList<Customer> cust;
    private ArrayList<ProductLine> prod;
    
    public SaleController() {
        cont = SaleContainer.getInstance();
        cCntrl = new CustomerController();
        pCntrl = new ProductController(); 
    }
 
    public void showProductMatches(String p) {
        String output = pCntrl.getSearchString(p);
        prod = pCntrl.getSearchResults(p);  
    }    
    
    public boolean addAction(String employee, int index, int amount) {
        index--;
        if(index >= 0) {
            if(index < prod.size() && index <= prod.get(index).getStock()) {
                cont.createAction(employee, amount, prod.get(index).getProduct());
                decreaseStock(prod.get(index).getIndex()-1,amount);            
                return true;
            } 
        }
        return false;
    }
    
    public double runningTotal() {double cost = cont.getRunningTotal(); return cost;}        
    
    public void addAnotherLine(int index, int amount) {
        index--;
        cont.addActionLine(amount,prod.get(index).getProduct());
        amount = amount * -1;
        decreaseStock(prod.get(index).getIndex()-1,amount);
    }

    public void decreaseStock(int index, int amount) {
        amount *= - 1;
        pCntrl.changeStock(index,amount);
    }    
    
    public void showCustomerMatches(String c) {
        String output = cCntrl.getSearchString(c);
        cust = cCntrl.getSearchResults(c);
    }    

    public void setCustomerIndex(int index) {
        index--;
        if(index > 0) {
            if(index < cust.size()) {
                cont.addCustomer(cust.get(index));   
            }
        }
    }

    public void setBillStatus(int index) {cont.setStatus(index);}
    
    public String bill() {String bill = cont.getBill(); return bill;}
}