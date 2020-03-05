package item;

/**
 * @author Iacobescu Tudor
 */
public class Food extends Item {
    private int weight;
    private String name;
    /**
     * Gets the profit factor of this food.
     *
     * Food value is twice its weight, and the profit factor is a weight-to-value ratio, so the factor is always 2.
     * @return the profit factor, always 2
     */
    @Override
    public int profitFactor() {
        return 2;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public int getValue() {
        return 2 * weight;
    }

    /**
     * Create a food item, valued at twice its given weight.
     *
     * @param weight strictly positive
     */
    public Food(String name, int weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Attempted to create Food with zero or negative weight.");
        }
        this.name = name;
        this.weight = weight;
    }
}
