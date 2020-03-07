package algorithm;

import item.Item;
import knapsack.Knapsack;
import knapsack.Problem;

import java.util.ArrayList;
import java.util.List;

public abstract class AlgorithmBase implements Algorithm {
    Problem problem;
    Knapsack knapsack;
    List<Item> itemList;

    /**
     * Instantiate the algorithm on a certain problem.
     *
     * @param problem the problem to solve
     */
    public AlgorithmBase(Problem problem) {
        this.problem = problem;
        this.knapsack = new Knapsack(problem.getCapacity());
        this.itemList = new ArrayList<>(this.problem.getItemList());

    }

    @Override
    public Knapsack result() {
        return this.knapsack;
    }
}
