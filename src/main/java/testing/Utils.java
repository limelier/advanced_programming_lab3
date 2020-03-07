package testing;

import item.Book;
import item.Food;
import item.Item;
import item.Weapon;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Utils {
    static final List<Book> books = Arrays.asList(
            new Book("Aqua Affinity", 120, 2),
            new Book("Bane of Arthropods", 511, 5),
            new Book("Blast Protection", 450, 2),
            new Book("Channeling", 110, 1),
            new Book("Curse of Binding", 108, 1),
            new Book("Curse of Vanishing", 121, 1),
            new Book("Depth Strider", 320, 2),
            new Book("Efficiency", 531, 10),
            new Book("Feather Falling", 410, 5),
            new Book("Fire Aspect", 210, 2),
            new Book("Fire Protection", 450, 5),
            new Book("Flame", 110, 2),
            new Book("Fortune", 330, 2),
            new Book("Frost Walker", 201, 2),
            new Book("Impaling", 510, 2),
            new Book("Infinity", 110, 1),
            new Book("Knockback", 210, 5),
            new Book("Looting", 310, 2),
            new Book("Loyalty", 310, 5),
            new Book("Luck of the Sea", 310, 2),
            new Book("Lure", 310, 2),
            new Book("Mending", 119, 2),
            new Book("Multishot", 110, 2),
            new Book("Piercing", 410, 10),
            new Book("Power", 510, 10),
            new Book("Projectile Protection", 450, 5),
            new Book("Protection", 450, 10),
            new Book("Punch", 210, 2),
            new Book("Quick Charge", 310, 5),
            new Book("Respiration", 320, 2),
            new Book("Riptide", 310, 2),
            new Book("Sharpness", 520, 10),
            new Book("Chopping", 310, 0),
            new Book("Silk Touch", 130, 1),
            new Book("Smite", 520, 5),
            new Book("Sweeping Edge", 510, 2),
            new Book("Thorns", 314, 1),
            new Book("Unbreaking", 490, 5)
    );

    static final List<Food> foods = Arrays.asList(
            new Food("Beetroot", 1),
            new Food("Dried Kelp", 1),
            new Food("Potato", 1),
            new Food("Pufferfish", 1),
            new Food("Tropical Fish", 1),
            new Food("Cake Slice", 2),
            new Food("Cookie", 2),
            new Food("Melon Slice", 2),
            new Food("Poisonous Potato", 2),
            new Food("Raw Chicken", 2),
            new Food("Raw Cod", 2),
            new Food("Raw Mutton", 2),
            new Food("Raw Salmon", 2),
            new Food("Spider Eye", 2),
            new Food("Sweet Berries", 2),
            new Food("Carrot", 3),
            new Food("Raw Beef", 3),
            new Food("Raw Porkchop", 3),
            new Food("Raw Rabbit", 3),
            new Food("Apple", 4),
            new Food("Chorus Fruit", 4),
            new Food("Enchanted Golden Apple", 4),
            new Food("Golden Apple", 4),
            new Food("Rotten Flesh", 4),
            new Food("Baked Potato", 5),
            new Food("Bread", 5),
            new Food("Cooked Cod", 5),
            new Food("Cooked Rabbit", 5),
            new Food("Beetroot Soup", 6),
            new Food("Cooked Chicken", 6),
            new Food("Cooked Mutton", 6),
            new Food("Cooked Salmon", 6),
            new Food("Golden Carrot", 6),
            new Food("Honey Bottle", 6),
            new Food("Mushroom Stew", 6),
            new Food("Suspicious Stew", 6),
            new Food("Cooked Porkchop", 8),
            new Food("Pumpkin Pie", 8),
            new Food("Steak", 8),
            new Food("Rabbit Stew", 10),
            new Food("Cake", 14)
    );

    static final Map<Weapon.Type, Integer> weaponWeights = Map.of(
            Weapon.Type.Axe, 3,
            Weapon.Type.Hoe, 2,
            Weapon.Type.Pickaxe, 3,
            Weapon.Type.Shovel, 1,
            Weapon.Type.Sword, 2
    );

    static final Map<Weapon.Material, Integer> weaponValues = Map.of(
            Weapon.Material.Wood, 1,
            Weapon.Material.Stone, 2,
            Weapon.Material.Iron, 3,
            Weapon.Material.Gold, 4,
            Weapon.Material.Diamond, 5,
            Weapon.Material.Netherite, 6
    );

    static final Random random = new Random();

    enum Category {
        Book, Food, Weapon
    }

    /**
     * Get a random value of a given enum.
     * <p>
     * Code taken from <a href=https://stackoverflow.com/a/14257525>this answer</a> on StackOverflow.
     *
     * @param en the enum, given as "TheEnum.class"
     * @return the random value
     */
    static private <T extends Enum<?>> T randomEnum(Class<T> en) {
        return en.getEnumConstants()[random.nextInt(en.getEnumConstants().length)];
    }

    /**
     * Get a random item from a list.
     *
     * @param list the list
     * @return the chosen item
     */
    static private <T> T randomListItem(List<T> list) {
        return list.get(random.nextInt(list.size()));
    }

    /**
     * Get a random item of one of the categories.
     *
     * @return the random item
     */
    static Item randomItem() {
        Category category = randomEnum(Category.class);
        switch (category) {
            case Book:
                return randomListItem(books);
            case Food:
                return randomListItem(foods);
            case Weapon:
                Weapon.Material material = randomEnum(Weapon.Material.class);
                Weapon.Type type = randomEnum(Weapon.Type.class);
                return new Weapon(material, type, weaponWeights.get(type), weaponValues.get(material));
            default:
                throw new Error("Enum value returned by randomEnum was not one of the known options.");
        }
    }
}
