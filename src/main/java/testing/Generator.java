package testing;

import item.*;
import knapsack.Problem;

import java.util.*;

public class Generator {
    /**
     * Generate a random problem with a given number of items and a given capacity.
     *
     * @param items the number of items
     * @param capacity the knapsack capacity
     * @return the generated problem
     */
    private static Problem generateProblem(int items, int capacity) {
        List<Item> itemList = new ArrayList<>(items);
        for (int i = 0; i < items; i++) {
            itemList.add(Utils.randomItem());
        }

        return new Problem(capacity, itemList);
    }

    /**
     * Generate a random problem with 1 to 20 items and 0 to 20 capacity.
     *
     * @return the generated problem
     */
    public static Problem generateProblem() {
        int items = Utils.random.nextInt(19) + 1;
        int capacity = Utils.random.nextInt(20);

        return generateProblem(items, capacity);
    }
}
