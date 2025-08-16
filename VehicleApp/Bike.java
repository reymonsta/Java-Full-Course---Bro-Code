public class Bike implements Vehicle{

   public void start(){
      System.out.println("Bike is starting with ignition."); 
   }
     
   public void stop(){
      System.out.println("Bike is stopping."); 
   }
     
   public void accelerate(){ 
      System.out.println("Bike is accelerating."); 
   }
    
   public void brake(){ 
      System.out.println("Bike is braking."); 
   }
}