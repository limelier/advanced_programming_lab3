package knapsack;

import item.Item;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Problem {
    int capacity;
    List<Item> itemList;

    /**
     * Create a knapsack problem, with a knapsack of the given capacity and a list of items, sorted by name.
     *
     * @param capacity the capacity of the knapsack
     * @param items the items presented by the problem
     */
    public Problem(int capacity, Item ...items) {
        this.capacity = capacity;
        List<Item> itemList = Arrays.asList(items);
        itemList.sort(Comparator.comparing(Item::getName));
        this.itemList = itemList;
    }

    @Override
    public String toString() {
        return "Problem{" +
                "capacity=" + capacity +
                ", items=" + itemList +
                '}';
    }
}
