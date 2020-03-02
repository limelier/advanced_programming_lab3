package item;

/**
 * @author Iacobescu Tudor
 */
public abstract class Item {
    // using an abstract class instead of an interface to implement toString, for DRY's sake

    /**
     * Gets the profit factor, usually the value-to-weight ratio, of this item.
     *
     * @return the profit factor
     */
    public double profitFactor() // TODO: complete compulsory score - in an interface, this would be default
    {
        return getWeight() / (double) getValue();
    }

    public abstract String getName();

    public abstract double getWeight();

    public abstract int getValue();

    /**
     * @return a string with the item's name, weight and value
     */
    @Override
    public String toString() {
        return "{" +
                this.getName() +
                ", w=" + this.getWeight() +
                ", v=" + this.getValue() +
                "}";
    }
}
