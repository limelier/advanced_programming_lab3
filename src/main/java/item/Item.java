package item;

/**
 * @author Iacobescu Tudor
 */
public interface Item {
    // using an abstract class instead of an interface to implement compareTo, for DRY's sake

    /**
     * Gets the profit factor, usually the value-to-weight ratio, of this item.
     *
     * @return the profit factor
     */
    double profitFactor();
    String getName();
}
