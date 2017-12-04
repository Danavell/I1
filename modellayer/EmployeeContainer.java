package modellayer;
import java.util.*;

public class EmployeeContainer
{
    private static EmployeeContainer instance = null;
    private Employee employee;
    HashMap<String, Employee> cont;    
    
    private EmployeeContainer()
    {
        cont = new HashMap<>();
    }
    
    public static EmployeeContainer getInstance()
    {
        if(instance == null)
        {
            instance = new EmployeeContainer();
        }
        return instance;
    }

    private String generateKey(Employee e) {
        String key = e.getIndex() + "|" + e.getName() + "|" + e.getID() + "|" + e.getPosition();
        return key.toLowerCase();
    }    
    
    public void createEmployee(Employee employee) { 
        cont.put(generateKey(employee), employee);
    }

    public void deleteEmployee(Employee employee) {
        cont.remove(generateKey(employee));
    }        
    
    public ArrayList searchEmployee(String key) {
        ArrayList<Employee> matches = new ArrayList<>();

        key = key.toLowerCase();

        for (Map.Entry<String, Employee> entry : cont.entrySet()) {
            if (entry.getKey().contains(key)) {
                matches.add(entry.getValue());
            }
        }

        return matches;
    }
}