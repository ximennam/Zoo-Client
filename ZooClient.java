import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.io.File;
import java.util.stream.Stream;

public class ZooClient
{
      public static void main (String [] args)
   {
   
// Creating an arraylist using the Bird class 

      ArrayList<Bird> FirstAL = new ArrayList<Bird>();

      Scanner scan = new Scanner (System.in);

// using a do-while loop in order to loop the menu options 

      int index =0; 
      boolean done = false;
     do {
         do {
            System.out.println("Menu:");
            System.out.println("0. Add a new penguin or hummingbird");
            System.out.println("1. Remove based off call sign");
            System.out.println("2. Print all zoo critters"); 
            System.out.println("3. Fly all birds");
            System.out.println("4. Have all the birds chirp");
            System.out.println("5. Feed all animals with eat");
            System.out.println("6. Swim all birds");
            System.out.println("7. Have all penguins tapDance");
            System.out.println("8. Quit");
      
         while (!scan.hasNextInt()) {
         String garbage = scan.next();
         } 
         index = scan.nextInt(); 
  
         } while(!(index <= (8) && index >= 0));
   
  
   switch (index)
   {
      case 0: // Adding a new penguin or hummingbird
      System.out.println("Which would you like to add? (P= Penguin and H = Hummingbird)"); 
      String NewBird = scan.next(); 
      String Added = ""; 
      String calling ="";
      int meals =0; 
      boolean canSwim = true;
      String name = ""; 
     

         if (NewBird.equals("P"))
         {
            System.out.println("enter in a callsign and the number of meals previously eaten:");
            calling = scan.next();
            meals = scan.nextInt(); 
            canSwim = true; 
            Bird penguin = new Penguin(calling, canSwim, meals ); 
            FirstAL.add(penguin); 
         }
         if (NewBird.equals("H"))
         {
            System.out.println("Enter in a name, callsign, and the number of meals previously eaten.");
            name = scan.next();
            calling = scan.next();
            meals = scan.nextInt(); 
            canSwim = false; 
            Bird hummingbird = new Hummingbird(name, calling, canSwim, meals); 
            FirstAL.add(hummingbird); 
         } 
         break;
      
      
      case 1: // Remove based on call sign 
      System.out.println("Enter which you wanted removed based off call sign."); 
      String Remove = scan.next(); 
      for(int i=0;i<FirstAL.size();i++)
      {
        if (FirstAL.get(i).getCallSign().equals(Remove))
        {
            FirstAL.remove(i);
        }
      }
      break;
     
      // printing out the list
     case 2: 
     for(int i=0;i<FirstAL.size();i++)
     System.out.println(FirstAL.get(i));
     
     break;
     
     case 3: // Fly all birds
     for(int i=0;i<FirstAL.size();i++)
     FirstAL.get(i).fly();
     break;
     
     case 4: // birds all chirp
     for(int i=0;i<FirstAL.size();i++)
     FirstAL.get(i).chirp();
     break;
      
     case 5: // feed all animals
     for(int i=0;i<FirstAL.size();i++)
     FirstAL.get(i).eat();
     break;
      
     case 6: // swim all animals
     for(int i=0;i<FirstAL.size();i++)
     FirstAL.get(i).swim();
     break;
      
     case 7:// tap dancing penguins, loop it for how many penguins there are 
     for (int i = 0; i < 1; i++)
     {
     
         System.out.println("Tap dancing penguin!");
     }
     break;
     
     case 8: // quit
     if (index == 8)
     {
         done = true;
         break; 
      }
      else
      {
      }
     break; 
     } 
     
     
     
     } while (!done);

     
      
   }
}