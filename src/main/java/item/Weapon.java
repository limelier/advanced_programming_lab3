package item;

/**
 * @author Iacobescu Tudor
 */
public class Weapon extends ItemBase implements Item {
    public enum Material {
        Wood, Stone, Iron, Gold, Diamond, Netherite
    }

    public enum Type {
        Sword, Axe, Pickaxe, Shovel, Hoe
    }

    private Type type;
    private Material material;
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
    public Weapon(Material material, Type type, int value, int weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Attempted to create Weapon with zero or negative weight.");
        }
        this.material = material;
        this.type = type;
        this.value = value;
        this.weight = weight;
    }
}
