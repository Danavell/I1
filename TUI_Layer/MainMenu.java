package TUI_Layer;


/**
 * Write a description of class MainMenu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class MainMenu extends Menu
{
    
    private EmployeeMenu employeeMenu;
    private ActionMenu actionMenu;
    public MainMenu()
    {
        
        super("Main Menu",null);
        
        printMenu();
        chooseTask();
    }
    public void printMenu() /** This method prints */
    {
       // System.out.println("\f");
        printMenuDescription();
        System.out.println("\n");
        System.out.println("Press 1 for EmployeeMenu");
        System.out.println("Press 2 for ActionMenu");
        System.out.println("Press 3 for ComingMenu");
        System.out.println("Press 4 to exit program");
        
    }
   
    public void chooseTask()
    { 
       int menuNumber = sc.nextInt();
       String whichMenu;
       
       switch(menuNumber)
       {    
           case 1: 
           { 
                if(employeeMenu == null )
                {
                System.out.println("You have created new employeeMenu object");
                employeeMenu = new EmployeeMenu(this);
                employeeMenu.chooseTask();
                break;  
                }
                else
               {
                employeeMenu.printMenu();
                employeeMenu.chooseTask();
                break;  
               }    
               
           }
           case 2: 
           { 
                if(actionMenu == null )
                {
                System.out.println("You have created new actionMenu object");
                actionMenu = new ActionMenu(this);
                actionMenu.chooseTask();
                break;  
                }
                else
               {
                actionMenu.printMenu();
                actionMenu.chooseTask();
                break;  
               }    
               
           }
           
            default: System.out.println("\f" +"\n" + "wrong number please try again");
            printMenu();
            this.chooseTask();      
       }
    }
}
