class OvernightShipping implements ShippingStrategy {

    public double calculateCost(double weight) {
        return weight * 50;
    }
}