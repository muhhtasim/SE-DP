class StandardShipping implements ShippingStrategy {

    public double calculateCost(double weight) {
        return weight * 10;
    }
}