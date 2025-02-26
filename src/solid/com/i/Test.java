package solid.com.i;

public class Test {
	 public static void main(String[] args) {
	        ParkingLot lot = new ParkingLot();
	        Car car = new Car();
	        
	        lot.parkVehicle(car);
	        lot.processTicket(car);
	        lot.unparkVehicle(car);
	    }
}
