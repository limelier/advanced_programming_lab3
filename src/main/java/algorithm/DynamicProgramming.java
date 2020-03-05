package algorithm;

import item.Item;
import knapsack.Knapsack;
import knapsack.Problem;

import java.util.ArrayList;
import java.util.List;

public class DynamicProgramming extends AlgorithmBase {
    List<Knapsack> current;
    List<Knapsack> previous;

    /**
     * Instantiate the algorithm on a certain problem.
     *
     * @param problem the problem to solve
     */
    public DynamicProgramming(Problem problem) {
        super(problem);
        populateCurrent();
        previous = null;
    }

    private void populateCurrent() {
        current = new ArrayList<>();
        int maxCapacity = problem.getCapacity();
        for (int i = 0; i <= maxCapacity; i++) {
            current.add(new Knapsack(i));
        }
    }

    /**
     * Solves the given knapsack problem.
     */
    @Override
    public void solve() {
        for (Item item : itemList) {
            for (int capacity = 0; capacity <= problem.getCapacity(); capacity++) {
                Knapsack knapsack = current.get(capacity);
                if (previous == null) {
                    if (knapsack.canFit(item)) {
                        knapsack.insert(item);
                    }
                } else {
                    if (item.getWeight() > capacity) { // if the item could never fit, just use the previous knapsack
                        current.set(capacity, previous.get(capacity));
                    } else {
                        int remainder = capacity - item.getWeight();
                        int prevValue = previous.get(capacity).getValue();
                        int potentialValue = previous.get(remainder).getValue() + item.getValue();
                        if (prevValue > potentialValue) { // item isn't worth it, use previous knapsack
                            current.set(capacity, previous.get(capacity));
                        } else { // item is worth it
                            knapsack = new Knapsack(previous.get(remainder), capacity);
                            knapsack.insert(item);
                            current.set(capacity, knapsack);
                        }
                    }
                }
            }
            previous = current;
            populateCurrent();
        }
        this.knapsack = previous.get(problem.getCapacity());
    }
}
