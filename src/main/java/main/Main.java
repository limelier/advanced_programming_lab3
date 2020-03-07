package main;

import algorithm.Algorithm;
import algorithm.DynamicProgramming;
import algorithm.GreedyApproximation;
import item.*;
import knapsack.Problem;
import testing.Generator;

/**
 * @author Iacobescu Tudor
 */
public class Main {
    public static void main(String[] args) {
        Problem problem = Generator.generateProblem();
        System.out.println(problem);
        Algorithm alg1 = new DynamicProgramming(problem);
        alg1.solve();
        System.out.println(alg1.result());
    }
}
