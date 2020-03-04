package main;

import algorithm.Algorithm;
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
        alg.solve();
        System.out.println("Greedy algorithm solution:\n" + alg.result());
    }
}
