package algorithm;

import item.Item;
import knapsack.Knapsack;
import knapsack.Problem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GreedyApproximation extends AlgorithmBase implements Algorithm {
    /**
     * Instantiate the algorithm on a certain problem.
     *
     * @param problem the problem to solve
     */
    public GreedyApproximation(Problem problem) {
        super(problem);
    }

    /**
     * Approximates a solution the given knapsack problem using a greedy algorithm.
     *
     * The algorithm tries inserting the items with the biggest profit factor first, until the knapsack is full.
     */
    @Override
    public void solve() {
        itemList.sort(Comparator.comparing(Item::profitFactor)); // sorts descending

        for (Item item : itemList) {
            if (knapsack.canFit(item)) {
                knapsack.insert(item);
            }
        }
    }
}
