package item;

/**
 * @author Iacobescu Tudor
 */
public abstract class Item {
    // using an abstract class instead of an interface to implement compareTo, for DRY's sake

    /**
     * Gets the profit factor, usually the value-to-weight ratio, of this item.
     *
     * @return the profit factor
     */
    abstract double profitFactor();
    abstract String getName();
    int compareTo(Item other) {
        return this.getName().compareTo(other.getName());
    }
}
