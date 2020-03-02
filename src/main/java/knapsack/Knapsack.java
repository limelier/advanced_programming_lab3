package knapsack;

import item.Item;

import java.util.List;

/**
 * @author Iacobescu Tudor
 */
public class Knapsack {
    private List<Item> itemList;
    private int capacity;

    /**
     * @param capacity the capacity of the knapsack, strictly positive
     */
    public Knapsack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Attempted to create Knapsack of zero or negative capacity.");
        }
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
