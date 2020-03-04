package knapsack;

import item.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Iacobescu Tudor
 */
public class Knapsack {
    private List<Item> itemList;
    private int capacity;
    private double taken;

    /**
     * @param capacity the capacity of the knapsack, strictly positive
     */
    public Knapsack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Attempted to create Knapsack of zero or negative capacity.");
        }
        this.capacity = capacity;
        this.itemList = new ArrayList<>();
    }

    public boolean canFit(Item item) {
        return capacity - taken >= item.getWeight();
    }

    public void insert(Item item) {
        if (item.getWeight() > capacity - taken) {
            throw new IllegalArgumentException(
                    "Attempted to insert item into knapsack that would put it over capacity."
            );
        }
        int index = Collections.binarySearch(itemList, item, Comparator.comparing(Item::getName));
        if (index < 0) {
            index = -index - 1; // convert invalid index (item not found) to valid index (where to put the item)
        }
        itemList.add(index, item);
        taken += item.getWeight();
    }

    @Override
    public String toString() {
        return "Knapsack{" +
                "capacity=" + capacity +
                ", items=" + itemList +
                '}';
    }
}
