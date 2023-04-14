public abstract class Bird
{
   private String callsign;
   private boolean canSwim;
   private int mealsEaten;
   private String name; 
 
   public Bird(String calling, boolean swimming, int eaten)
   {
      callsign = calling;
      canSwim = swimming;
      mealsEaten = eaten;
   }
   
// Creating methods in order to actually call variables such as callsign, canSwim, mealsEaten, and name 
   public String getCallSign()
   {
   return callsign;
   }
   
   public boolean getCanSwim()
   {
   return canSwim;
   }
   
   public int getMealsEaten()
   {
   return mealsEaten;
   }
   
   public void setMealsEaten(int mealsEaten)
   {
      this.mealsEaten = mealsEaten;
   }
   
   public String getName()
   {
   return name;
   }
   
 // abstract method fly
 
 private boolean Bird =false; 
 
   public abstract void fly();
   
 
 // abstract method chirp
 
 public abstract void chirp();

 // abstract method swim
 
 public abstract void swim();

 
 // abstract method eat 
 
 public abstract void eat();


 
 
 
 
 
 
 }