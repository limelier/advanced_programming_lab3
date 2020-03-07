package item;

/**
 * @author Iacobescu Tudor
 */
public class Weapon extends ItemBase implements Item {
    public enum material {
        Wood, Stone, Iron, Gold, Diamond, Netherite
    }

    public enum type {
        Sword, Axe, Pickaxe, Shovel, Hoe
    }

    private Weapon.type type;
    private Weapon.material material;
    private int value;
    private int weight;

    @Override
    public String getName() {
        return material.name() + ' ' + type.name();
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public int getValue() {
        return value;
    }

    /**
     * @param material the material for the weapon
     * @param type   the type of the weapon
     * @param value  the value of the weapon
     * @param weight the weight of the weapon, strictly positive
     */
    public Weapon(Weapon.material material, Weapon.type type, int value, int weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Attempted to create Weapon with zero or negative weight.");
        }
        this.material = material;
        this.type = type;
        this.value = value;
        this.weight = weight;
    }
}
