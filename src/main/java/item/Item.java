package item;

public interface Item {
    /**
     * Gets the profit factor, usually the value-to-weight ratio, of this item.
     *
     * @return the profit factor
     */
    default int profitFactor() {
        return getWeight() / getValue();
    }

    String getName();

    int getWeight();

    int getValue();
}
