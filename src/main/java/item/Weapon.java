package item;

/**
 * @author Iacobescu Tudor
 */
public class Weapon extends Item {
    private WeaponType type;
    private int value;
    private int weight;

    @Override
    public String getName() {
        return type.name();
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
     *
     * @param type the type of the weapon
     * @param value the value of the weapon
     * @param weight the weight of the weapon, strictly positive
     */
    public Weapon(WeaponType type, int value, int weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Attempted to create Weapon with zero or negative weight.");
        }
        this.type = type;
        this.value = value;
        this.weight = weight;
    }
}
