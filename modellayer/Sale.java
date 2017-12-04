package modellayer;

public class Sale
{
    private Customer customer;
    private String employee;
    private Action action;

    private String status;
    private String bill;
    private static int serial;
    /**
     * Constructor for objects of class Sale
     */
    public Sale(String e,int amount, Product p) {
        employee = e;
        action = new Action(amount, p); 
        serial += 1;
    }
    
    public String bill(){
        bill  = "Sale ID: " + serial + "\n"
                + "=======================================\n"
                +  action.actionPrint() + "\n"
                + "Total: " + getCSP()  + "\n"
                + "=======================================\n";                
        return bill;
    }    
    
    public int getSerial() {return serial;}    
    public double getCSP() {return action.calcSalePrice();}    
    public void setStatus(String s) {status = s;}    
    public void addCustomer(Customer cust) {customer = cust;}                  
    public void addAL(int amount, Product product) {action.addActionLine(amount, product);}
}
