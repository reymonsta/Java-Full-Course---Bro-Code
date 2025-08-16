public class Car implements Vehicle{

   public void start(){
      System.out.println("Car is starting with ignition."); 
   }
     
   public void stop(){
      System.out.println("Car is stopping."); 
   }
     
   public void accelerate(){ 
      System.out.println("Car is accelerating."); 
   }
    
   public void brake(){ 
      System.out.println("Car is braking."); 
   }
}