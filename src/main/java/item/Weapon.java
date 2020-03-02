package item;

/**
 * @author Iacobescu Tudor
 */
public class Weapon extends Item {
    private WeaponType type;
    private int value;
    private int weight;

    /**
     * Gets the profit factor, or weight-to-value ratio, of this item.
     *
     * @return the profit factor
     */
    @Override
    public double profitFactor() {
        return (double)value / (double)weight;
    }

    @Override
    public String getName() {
        return type.name();
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

    @Override
    public String toString() {
        return "Weapon{" +
                type +
                ", value=" + value +
                ", weight=" + weight +
                '}';
    }
}
