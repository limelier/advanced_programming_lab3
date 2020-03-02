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
     * The weight of the book is taken to be the number of pages / 100.
     *
     * @return the profit factor, a weight-to-value ratio
     */
    @Override
    public double profitFactor() {
        double weight = (double) pages / 100;
        return value / weight;
    }

    /**
     * @param pages the number of pages in the book, strictly positive
     * @param value the value of the book
     */
    public Book(int pages, int value) {
        if (pages <= 0) {
            throw new IllegalArgumentException("Attempted to create Book with zero or negative pages.");
        }
        this.pages = pages;
        this.value = value;
    }
}
