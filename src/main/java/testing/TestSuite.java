package testing;

import java.util.*;

public class TestSuite {
    static List<String> algorithms = Arrays.asList("GreedyApproximation", "DynamicProgramming");
    List<Test> testList;

    /**
     * Create a test suite with a given number of randomly-generated tests.
     *
     * @param tests the number of tests for the suite
     */
    public TestSuite(int tests) {
        this.testList = new ArrayList<>();
        for (int i = 0; i < tests; i++) {
            testList.add(new Test(Generator.generateProblem()));
        }
    }

    /**
     * Run the test suite's tests.
     */
    public void run() {
        for (Test test : testList) {
            test.run();
        }
    }

    /**
     * Get the name of the algorithm with a better time.
     *
     * @param results the results to sort through
     * @return the name of the better algorithm, or "none" if there are multiple best algorithms
     */
    private String betterTime(List<TestResult> results) {
        results.sort(Comparator.comparing(TestResult::getTime));
        if (results.get(0).getTime() == results.get(1).getTime()) {
            return "none";
        } else {
            return results.get(0).getName();
        }
    }

    /**
     * Get the name of the algorithm with a better value obtained.
     *
     * @param results the results to sort through
     * @return the name of the better algorithm, or "none" if there are multiple best algorithms
     */
    private String betterValue(List<TestResult> results) {
        results.sort(Comparator.comparing(TestResult::getValue).reversed());
        if (results.get(0).getValue() == results.get(1).getValue()) {
            return "none";
        } else {
            return results.get(0).getName();
        }
    }

    /**
     * Print the results of the test suite.
     */
    public void printResult() {
        Map<String, int[]> criteria = new HashMap<>();
        // criteria, in order: speed, value
        for (String algorithm : algorithms) {
            criteria.put(algorithm, new int[]{0, 0});
        }
        criteria.put("none", new int[]{0, 0});

        for (Test test : testList) {
            List<TestResult> results = test.results();
            System.out.println(results);
            criteria.get(betterTime(results))[0]++;
            criteria.get(betterValue(results))[1]++;
        }

        System.out.println("Number of tests run: " + testList.size());
        for (String algorithm : algorithms) {
            System.out.println(
                    "Algorithm " +
                            algorithm +
                            " was fastest " +
                            criteria.get(algorithm)[0] +
                            " times and yielded better results " +
                            criteria.get(algorithm)[1] +
                            " times."
            );
        }
        System.out.println("No algorithm was fastest " + criteria.get("none")[0] + " times.");
        System.out.println("No algorithm yielded better results " + criteria.get("none")[1] + " times.");
    }
}
