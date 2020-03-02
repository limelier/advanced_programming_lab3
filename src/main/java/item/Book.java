package item;

/**
 * @author Iacobescu Tudor
 */
public class Book implements Item {
    private int pages;
    private int value;
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getWeight() {
        return (double) pages / 100;
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

    @Override
    public String toString() {
        return "Book{" +
                name +
                ", w=" + getWeight() +
                ", v=" + value +
                '}';
    }
}
