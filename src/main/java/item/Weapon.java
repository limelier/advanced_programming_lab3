package item;

public class Weapon implements Item {
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

    public Weapon(WeaponType type, int value, int weight) throws IllegalArgumentException {
        if (weight <= 0) {
            throw new IllegalArgumentException("Attempted to create Weapon with zero or negative weight.");
        }
        this.type = type;
        this.value = value;
        this.weight = weight;
    }
}
