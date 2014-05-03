package mainPackage;

import java.util.Scanner;

public class Main {
    public static boolean replay;
         
    public static void main(String[] args) {
    
        String input;
        Scanner Keyboard = new Scanner(System.in);               
        Dice dice = new Dice(3);
        Game game = new Game();
    
        do{                                 
            dice.Throw(dice.Bounces);
            game.AddThrows();
            dice.Value();      
            System.out.println("Dice Landed on "+dice.value);
            game.GetThrows();
            game.Retry();          
        }while(replay == true);        
    }    
}
