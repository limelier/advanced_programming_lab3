package testing;

import algorithm.Algorithm;
import algorithm.DynamicProgramming;
import algorithm.GreedyApproximation;
import knapsack.Problem;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Iacobescu Tudor
 */
public class Test {
    private List<Algorithm> algorithms;
    private List<TestResult> results;

    public Test(Problem problem) {
        this.algorithms = new ArrayList<>();
        algorithms.add(new GreedyApproximation(problem));
        algorithms.add(new DynamicProgramming(problem));
        this.results = new ArrayList<>();
    }

    public void run() {
        for (Algorithm algorithm : algorithms) {
            long start = System.nanoTime();
            algorithm.solve();
            long end = System.nanoTime();
            results.add(new TestResult(
                    algorithm.getClass().getSimpleName(),
                    end - start,
                    algorithm.result().getValue()
            ));
        }
    }

    public List<TestResult> results() {
        return this.results;
    }
}
