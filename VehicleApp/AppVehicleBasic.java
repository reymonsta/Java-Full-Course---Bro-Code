import java.util.Scanner;

public class AppVehicleBasic{
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Select a vehicle:");
      System.out.println("1 - Bike");
      System.out.println("2 - Car");  
      System.out.println("3 - Truck");
      System.out.print("Enter your choice (1-3): ");
      
      int choice = scanner.nextInt();
      
      // Create VehicleRunner with number input
      VehicleRunner vehicleRunner = new VehicleRunner(choice);
      
      vehicleRunner.run();
      
      scanner.close();
   }
}