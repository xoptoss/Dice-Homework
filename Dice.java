package mainPackage;

import java.util.Random;

public class Dice {
    
    int one,two,three,four,five,six;
    int value,newValue,total,newBounces,Bounces;
    
    static Random random = new Random();    
   
   
    public Dice(int newBounces)
    {
        Bounces = newBounces;
    }   
  
    public int Throw(int Bounces)
    {             
        total=Bounces;  
        value = 0;
        do
        {
            value = value+random.nextInt(6)+1;               
            total--;        
        }while(total>0);        
        
        newValue = value/Bounces;       
        
        return newValue;
    }    
  
    public int Throw()
    {
        newValue = random.nextInt(6)+1;
        return newValue;
    }    
  
    public int Value()
    {
        value = newValue;
        return value;
    }   
}
