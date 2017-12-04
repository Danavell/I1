package modellayer;

public class Employee
{
    private String name;
    private String address;
    private String email;
    private String position;
    private int id;
    private boolean manager;
    private String login;
    private String password;
    private static int index;
    
    public Employee(String name, String address, String email, String position, int id, String login, String password)
    {
        this.name = name;
        this.address = address;
        this.email = email;
        this.position = position;
        this.id = id;
        this.login = login;
        this.password = login;
        index++;
    }
    
    public void setName(String name) {this.name = name;}    
    public void setManager() {manager = true;}    
    public void setPosition(String pos){ position = pos;}
    
    public String getName() {return this.name;}    
    public int getIndex() {int i = index--; return i;}
    
    public boolean isManager()
    {
        if(manager == true)
        {
            return true;
        }
        else return false;
    }
    
    public String getPosition()
    {
         return this.position;
    }
    
    public int getID()
    {
        return this.id;
    }    
}