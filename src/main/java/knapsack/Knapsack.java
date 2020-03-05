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
     * @param capacity the capacity of the knapsack, a natural number
     *
     * A knapsack with zero capacity can only hold items of zero weight.
     */
    public Knapsack(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Attempted to create Knapsack of negative capacity.");
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

    public int getValue() {
        int value = 0;
        for (Item item : itemList) {
            value += item.getValue();
        }
        return value;
    }

    @Override
    public String toString() {
        return "Knapsack{" +
                "value=" + getValue() +
                ", items=" + itemList +
                '}';
    }
}
