package knapsack;

import item.Item;

import java.util.List;

/**
 * @author Iacobescu Tudor
 */
public class Knapsack {
    List<Item> itemList;
    int capacity;

    /**
     * @param capacity the capacity of the knapsack, strictly positive
     */
    public Knapsack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Attempted to create Knapsack of zero or negative capacity.");
        }
        this.capacity = capacity;
    }
}
