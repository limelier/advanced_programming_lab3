package algorithm;

import knapsack.Knapsack;
import knapsack.Problem;

public interface Algorithm {
    /**
     * Solves the given knapsack problem.
     *
     */
    void solve();

    /**
     * Get the knapsack filled by the algorithm.
     * @return the knapsack
     */
    Knapsack result();
}
