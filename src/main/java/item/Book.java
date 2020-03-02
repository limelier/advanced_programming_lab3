package item;

/**
 * @author Iacobescu Tudor
 */
public class Book implements Item {
    private int pages;
    private int value;

    /**
     * Gets the profit factor of this book.
     * <p>
     * The weight of the book is taken to be the number of pages / 100
     *
     * @return the profit factor, a weight-to-value ratio
     */
    @Override
    public double profitFactor() {
        double weight = (double) pages / 100;
        return value / weight;
    }

    /**
     * @param pages the number of pages, cannot be zero
     * @param value the value of the book
     */
    public Book(int pages, int value) throws IllegalArgumentException {
        if (pages == 0) {
            throw new IllegalArgumentException("Attempted to create book with no pages!");
        }
        this.pages = pages;
        this.value = value;
    }
}
