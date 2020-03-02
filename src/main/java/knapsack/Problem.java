package knapsack;

import item.Item;

import java.util.Arrays;
import java.util.List;

public class Problem {
    Knapsack knapsack;
    List<Item> itemList;

    /**
     * Create a knapsack problem, with a knapsack of the given capacity and a list of items.
     *
     * @param knapsackCapacity the capacity of the knapsack
     * @param items the items presented by the problem
     */
    public Problem(int knapsackCapacity, Item ...items) {
        this.knapsack = new Knapsack(knapsackCapacity);
        this.itemList = Arrays.asList(items);
    }
}
