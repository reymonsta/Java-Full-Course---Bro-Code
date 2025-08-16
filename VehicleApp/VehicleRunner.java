public class VehicleRunner{
   private Vehicle vehicle;

  // Create your constructor here
   public VehicleRunner(int vehicleType){
    
	   if (vehicleType == 1) {
	         this.vehicle = new Bike();
	         System.out.println("Bike selected");
	      } else if (vehicleType == 2) {
	         this.vehicle = new Car();
	         System.out.println("Car selected");
	      } else if (vehicleType == 3) {
	         this.vehicle = new Truck();
	         System.out.println("Truck selected");
	      } else {
	         // Default case for invalid input
	         this.vehicle = new Car(); // Default to car
	         System.out.println("Invalid input. Defaulting to Car");
	      }
   } 
   
   public VehicleRunner(Vehicle vehicle){
	      this.vehicle = vehicle;
	   }
  
  
   public void run() {
   //Your vehicle methods here
   
      vehicle.start();
      vehicle.stop();  
      vehicle.accelerate();
      vehicle.brake();
    
   
   
   }
}

