package testing;

import item.*;
import knapsack.Problem;

import java.util.*;

public class Generator {
    public static Problem generateProblem(int items, int capacity) {
        List<Item> itemList = new ArrayList<>(items);
        for (int i = 0; i < items; i++) {
            itemList.add(Utils.randomItem());
        }

        return new Problem(capacity, itemList);
    }
}
