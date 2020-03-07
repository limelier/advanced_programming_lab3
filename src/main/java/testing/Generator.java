package testing;

import item.*;
import knapsack.Problem;

import java.util.*;

public class ProblemGenerator {


    private static Item pickRandomItem() {
        int category = ProblemGeneratorConstants.randomCategory();
        switch (category) {
        }
    }

    static Problem generateProblem(int items, int capacity) {
        List<Item> itemList = new ArrayList<>(items);
        for (int i = 0; i < items; i++) {
            itemList.add(pickRandomItem());
        }
    }
}
