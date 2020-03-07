package main;

import algorithm.Algorithm;
import algorithm.DynamicProgramming;
import algorithm.GreedyApproximation;
import item.*;
import knapsack.Problem;
import testing.Generator;
import testing.Test;

/**
 * @author Iacobescu Tudor
 */
public class Main {
    public static void main(String[] args) {
        Test test = new Test(Generator.generateProblem());
        test.run();
        System.out.println(test.results());
    }
}
