class ExpressShipping implements ShippingStrategy {

    public double calculateCost(double weight) {
        return weight * 25;
    }
}