package algorithm;

import knapsack.Knapsack;
import knapsack.Problem;

public interface Algorithm {

    /**
     * Solves the given knapsack problem.
     *
     * @param problem the problem to solve
     * @return the filled knapsack resulting from the problem
     */
    Knapsack solve(Problem problem);
}
