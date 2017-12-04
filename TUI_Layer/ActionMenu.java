package TUI_Layer;


/**
 * Write a description of class MainMenu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class ActionMenu extends Menu
{
    
    
    
    public ActionMenu(Menu parent)
    {
        super("Action",parent);
        printMenu();
        
    }
    public void printMenu()
    {
        printMenuDescription();
        System.out.println("\n");
        System.out.println("Press 1 for Action one");
        System.out.println("Press 2 for Action two");
        System.out.println("Press 3 for Action three");
        System.out.println("Press 4 to go back" );
        System.out.println("This is my parent name" + parent.name);
        
    }
   
    public void chooseTask()
    {
    int menuNumber = sc.nextInt();
        String whichMenu;
        switch(menuNumber)
        {
            case 1: System.out.println("Action one was yet not uploaded, try another one");
            chooseTask();
            break;
            
            case 2:
                System.out.println("Action two was yet not uploaded, try another one");
                chooseTask();
                break;
            
            case 3: 
                System.out.println("Action three was yet not uploaded, try another one");
                chooseTask();
                break;
                
            case 4: 
                System.out.println("\f");
                goBackToPreviousMenu();
                break;
            
            default: 
            {
                whichMenu = "wrong number please try again";
                System.out.println("Akos you are fucking whore, let`s play WoW today");
                System.out.println("\n" + whichMenu);
                printMenu();
                chooseTask();
                break;
            }
            
        }
        
    }
        
}
        

