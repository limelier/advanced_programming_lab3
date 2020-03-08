package item;

public interface Item {
    /**
     * Gets the profit factor, usually the value-to-weight ratio, of this item.
     *
     * @return the profit factor
     */
    default double profitFactor() {
        return (double) getValue() / (double) getWeight();
    }

    String getName();

    int getWeight();

    int getValue();
}
