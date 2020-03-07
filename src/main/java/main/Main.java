package main;

import testing.TestSuite;

/**
 * @author Iacobescu Tudor
 */
public class Main {
    public static void main(String[] args) {
        TestSuite testSuite = new TestSuite(100);
        testSuite.run();
        testSuite.printResult();
    }
}
