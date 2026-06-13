package test06;

public class CompositionAggregationDemo {
    public static void main(String[] args) {

        // Driver exists independently
        Driver d1 = new Driver("Ashish");

        // Car uses the existing Driver
        Car car1 = new Car("Petrol Engine", d1);

        car1.displayCarInfo();

        System.out.println("\nDriver still exists independently of Car.");
        d1.showDriver();
    }
}
