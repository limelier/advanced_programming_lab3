package main;

import item.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Iacobescu Tudor
 */
public class Main {
    public static void main(String[] args) {
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Weapon(WeaponType.Sword, 5, 5));
        itemList.add(new Book("Chronicles of Narnia", 300, 3));
        itemList.add(new Food("Carrot", 2));

        System.out.println(itemList);
    }
}
