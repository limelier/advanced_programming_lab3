package main;

import item.Book;
import item.Food;
import item.Weapon;
import item.WeaponType;
import knapsack.Problem;

/**
 * @author Iacobescu Tudor
 */
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Dragon Rising", 300, 5);
        Book book2 = new Book("A Blade in the Dark", 300, 5);
        Food food1 = new Food("Cabbage", 2);
        Food food2 = new Food("Rabbit", 2);
        Weapon weapon = new Weapon(WeaponType.Sword, 10, 5);

        Problem problem = new Problem(10, book1, book2, food1, food2, weapon);
        System.out.println(problem);
    }
}
