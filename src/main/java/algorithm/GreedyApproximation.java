package algorithm;

import item.Item;
import knapsack.Knapsack;
import knapsack.Problem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GreedyApproximation implements Algorithm {
    /**
     * Approximates a solution the given knapsack problem using a greedy algorithm.
     *
     * The algorithm tries inserting the items with the biggest profit factor first, until the knapsack is full.
     *
     * @param problem the problem to solve
     * @return the filled knapsack resulting from the problem
     */
    @Override
    public Knapsack solve(Problem problem) {
        Knapsack knapsack = new Knapsack(problem.getCapacity());
        List<Item> itemList = new ArrayList<>(problem.getItemList());
        itemList.sort(Comparator.comparing(Item::profitFactor).reversed());

        for (Item item : itemList) {
            if (knapsack.canFit(item)) {
                knapsack.insert(item);
            }
        }

        return knapsack;
    }
}
