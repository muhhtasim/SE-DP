class ShippingCalculator {

    public double calculateCost(String type, double weight) {

        if (type.equals("STANDARD")) {
            return weight * 10;
        }
        else if (type.equals("EXPRESS")) {
            return weight * 25;
        }
        else if (type.equals("OVERNIGHT")) {
            return weight * 50;
        }

        return 0;
    }
}