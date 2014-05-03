package mainPackage;

import java.util.Scanner;

public class Game {
    String input;
    public int Throws=0;
    Scanner Keyboard = new Scanner(System.in); 
 
  public void GetThrows() 
   {
   System.out.println("You have Rolled "+Throws +" Time(s)");    
   }
   
   public void AddThrows()
    {
        Throws++;   
    }   
   
   public void Retry()
    {
        System.out.println("Roll Agian?");
        input = Keyboard.nextLine();
        
        switch(input.toLowerCase())
        {                
            case"yes":
            {
                Main.replay=true;                
                break;
            }
            case"no":
            {
                Main.replay=false;               
                break;
            }
            default:
            {
                System.out.println("Not a choice");               
                break;
            }
            
        }
    }
    
}
