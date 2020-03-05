package item;

/**
 * @author Iacobescu Tudor
 */
public class Book extends ItemBase implements Item {
    /**
     * The profit factor of a book with zero effective weight.
     */
    static final private int ZERO_WEIGHT_VALUE = 2147483647;

    private int pages;
    private int value;
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getWeight() {
        return pages / 100;
    }

    @Override
    public int getValue() {
        return value;
    }

    /**
     * @param pages the number of pages in the book, strictly positive
     * @param value the value of the book
     */
    public Book(String name, int pages, int value) {
        if (pages <= 0) {
            throw new IllegalArgumentException("Attempted to create Book with zero or negative pages.");
        }
        this.name = name;
        this.pages = pages;
        this.value = value;
    }

    /**
     * Gets the profit factor, usually the value-to-weight ratio, of this item.
     *
     * If the weight is zero, the profit factor becomes ZERO_WEIGHT_VALUE (you should always get the item).
     *
     * @return the profit factor
     */
    @Override
    public double profitFactor() {

        int weight = getWeight();
        if (weight == 0) {
            return ZERO_WEIGHT_VALUE;
        }
        else {
            return getValue() / weight;
        }
    }
}
