public class Hummingbird extends Bird
{

private String name; 
private String callsign;
private boolean canSwim;
private int mealsEaten;

// constructor for Hummingbird including name, unlike the bird class and penguin class

   public Hummingbird(String namee, String caller, boolean canSwim, int meals)
   {
      super(caller, canSwim, meals); 
      name = namee;

   }
   
   // overriding methods from the bird class!
   
   // fly 
   public void fly()
   {
      System.out.println(" " + name + "is flying high!!");
   }
   
   // chirp
   public void chirp()
   {
      System.out.println(" " + name + " chirps!!");  
   }
   
   // eating--adding one everytime! 
   public void eat()
   {
     setMealsEaten(getMealsEaten()+1); 
   }
   
   // can it swim? nope!
   private boolean Hummingbird = false; 
   public void swim()
   {
      canSwim = false;
      Hummingbird = false; 
      System.out.println("Hummingbirds cannot swim.");
   }
   
   // toString method, printing out the entirety of the hummingbird. 
   public String toString()
   {
      return name + ": " + "\n Meals Eaten: "+ getMealsEaten() + "\n Can Swim: " + getCanSwim() + "\n Callsign: " + getCallSign();    
   }
   
   
   






}