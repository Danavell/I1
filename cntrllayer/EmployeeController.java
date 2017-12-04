package cntrllayer;

import java.util.*;
import modellayer.*;

public class EmployeeController
{
    private EmployeeContainer cont;

    public EmployeeController()
    {
        cont = EmployeeContainer.getInstance();
    }

    public void add(String a, String b, String c, String d, int e, String f, String g)
    {
        cont.createEmployee(new Employee(a, b, c, d, e, f, g));
    }

    public void delete(Employee employee)
    {
        cont.deleteEmployee(employee);
    }
    
    public void update(Employee oldE, String a, String b, String c, String d, int e, String f, String g)
    {
        Employee newE = new Employee(a, b, c, d, e, f, g);
        cont.deleteEmployee(oldE);
        cont.createEmployee(newE);
    }
    
    public ArrayList<Employee> getSearchResults(String e)
    {
        ArrayList<Employee> matches = cont.searchEmployee(e);
        return matches;
    }
}
