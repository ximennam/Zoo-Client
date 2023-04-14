public class Penguin extends Bird
{
   private String pname; 

// constructor, calling the superclass 

   public Penguin(String calling, boolean swimming, int eaten )
   { 
      super(calling, swimming, eaten);
   }
   
// Overriding methods from Bird 

// fly method
   public void fly()
   {
      System.out.println("Penguins cannot fly!"); 
   }
   
   
   // chirp method
   public void chirp()
   {
      System.out.println("Penguin chirping!"); 
   }
   
   // swim method
   public void swim()
   {
      System.out.println("Penguin is swimming!"); 
   }
   
   // eat method , adding three everytime!
   public void eat()
   {
      for (int i=0; i<1;i++)
      { 
         setMealsEaten(getMealsEaten()+3); 
      }
   }
    
   // toString method, printing out the entirety of the penguin
   public String toString()
   {       
      
      System.out.println("in to string");
      String toReturn = "Penguin: " + "\n Meals Eaten: "+ getMealsEaten() + "\n Can Swim: " + getCanSwim() + "\n Callsign: " + getCallSign();    
  
      return toReturn;
   }
   
      
   
   
      
}