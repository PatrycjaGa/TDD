public class Merchandise {
    private String name;
    private double basePrice;

    public Merchandise(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getName() {
        return name;
    }

    /**
     * Sets new base price for merchandise
     * @param newBasePrice new price to replace the old one
     */
    public void setNewBasePrice(double newBasePrice) {
        basePrice = newBasePrice;
    }
}
