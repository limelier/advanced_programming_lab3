package item;

/**
 * @author Iacobescu Tudor
 */
abstract class ItemBase implements Item{
    /**
     * @return a string with the item's name, weight and value
     */
    @Override
    public String toString() {
        return "{" +
                this.getName() +
                ", w=" + this.getWeight() +
                ", v=" + this.getValue() +
                "}";
    }
}
