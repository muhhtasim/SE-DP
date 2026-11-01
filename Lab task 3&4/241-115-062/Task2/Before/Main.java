public class Main {
    public static void main(String[] args) {

        ShippingCalculator sc = new ShippingCalculator();

        System.out.println(sc.calculateCost("STANDARD", 5));
        System.out.println(sc.calculateCost("EXPRESS", 5));
        System.out.println(sc.calculateCost("OVERNIGHT", 5));
    }
}