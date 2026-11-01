class DroneShipping implements ShippingStrategy {

    public double calculateCost(double weight) {
        return (weight * 70) + 100;
    }
}