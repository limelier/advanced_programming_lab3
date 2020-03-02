package item;

public class Food implements Item {
    private int weight;
    /**
     * Gets the profit factor of this food.
     *
     * Food value is twice its weight, and the profit factor is a weight-to-value ratio, so the factor is always 2.
     * @return the profit factor, always 2
     */
    @Override
    public double profitFactor() {
        return 2;
    }
    
    public Food(int weight) throws IllegalArgumentException {
        if (weight <= 0) {
            throw new IllegalArgumentException("Attempted to create Food with zero or negative weight.");
        }
        this.weight = weight;
    }
}
