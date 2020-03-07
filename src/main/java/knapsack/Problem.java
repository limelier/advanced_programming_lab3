package knapsack;

import item.Item;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Problem {
    private int capacity;
    private List<Item> itemList;

    /**
     * Create a knapsack problem, with a knapsack of the given capacity and several items.
     *
     * @param capacity the capacity of the knapsack
     * @param items the items presented by the problem, which get sorted by name
     */
    public Problem(int capacity, Item ...items) {
        this.capacity = capacity;
        List<Item> itemList = Arrays.asList(items);
        itemList.sort(Comparator.comparing(Item::getName));
        this.itemList = itemList;
    }

    /**
     * Create a knapsack problem, with a knapsack of the given capacity and a list of items.
     *
     * @param capacity the capacity of the knapsack
     * @param items the items presented by the problem, which get sorted by name
     */
    public Problem(int capacity, List<Item> items) {
        this(capacity, items.toArray(new Item[0]));
    }

    public int getCapacity() {
        return this.capacity;
    }

    public List<Item> getItemList() {
        return this.itemList;
    }

    @Override
    public String toString() {
        return "Problem{" +
                "capacity=" + capacity +
                ", items=" + itemList +
                '}';
    }
}
