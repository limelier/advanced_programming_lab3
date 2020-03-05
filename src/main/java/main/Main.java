package main;

import algorithm.Algorithm;
import algorithm.DynamicProgramming;
import algorithm.GreedyApproximation;
import item.Book;
import item.Food;
import item.Weapon;
import item.WeaponType;
import knapsack.Knapsack;
import knapsack.Problem;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Iacobescu Tudor
 */
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Dragon Rising", 300, 5); // PF 1.66
        Book book2 = new Book("A Blade in the Dark", 300, 5); // PF 1.66
        Food food1 = new Food("Cabbage", 2); // PF 2
        Food food2 = new Food("Rabbit", 2); // PF 2
        Weapon weapon = new Weapon(WeaponType.Sword, 10, 5); // PF 2

        Problem problem = new Problem(10, book1, book2, food1, food2, weapon);
        System.out.println(problem);

        Algorithm alg = new GreedyApproximation(problem);
        Algorithm alg2 = new DynamicProgramming(problem);
        alg.solve();
        System.out.println("Greedy algorithm solution:\n" + alg.result());
        alg2.solve();
        System.out.println("Dynamic programming solution:\n" + alg2.result());

        // more interesting example:
        System.out.println("\nSecond problem:");
        Weapon item1 = new Weapon(WeaponType.Sword, 10, 4); // PF 2.5
        Weapon item2 = new Weapon(WeaponType.Axe, 10, 4); // PF 2.5
        Weapon item3 = new Weapon(WeaponType.Bow, 12, 6); // PF 2
        Problem problem2 = new Problem(10, item1, item2, item3);
        System.out.println(problem2);
        Algorithm alg3 = new GreedyApproximation(problem2);
        alg3.solve();
        System.out.println("Greedy algorithm solution:\n" + alg3.result());
        Algorithm alg4 = new DynamicProgramming(problem2);
        alg4.solve();
        System.out.println("Dynamic programming solution:\n" + alg4.result());


    }
}
