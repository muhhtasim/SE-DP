public class Main {
    public static void main(String[] args) {

        double weight = 5;

        ShippingStrategy s1 = new StandardShipping();
        ShippingStrategy s2 = new ExpressShipping();
        ShippingStrategy s3 = new OvernightShipping();
        ShippingStrategy s4 = new DroneShipping();

        System.out.println("Standard: " + s1.calculateCost(weight));
        System.out.println("Express: " + s2.calculateCost(weight));
        System.out.println("Overnight: " + s3.calculateCost(weight));
        System.out.println("Drone: " + s4.calculateCost(weight));
    }
}