package knapsack;

import item.Item;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
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

    public void insertItem(Item item) {
        int index = Collections.binarySearch(itemList, item, Comparator.comparing(Item::getName));
        if (index < 0) {
            index = -index - 1; // convert invalid index (item not found) to valid index (where to put the item)
        }
        itemList.add(index, item);
    }
}
