package testing;

/**
 * @author Iacobescu Tudor
 */
public class TestResult {
    private String name;
    private long time;
    private int value;

    public String getName() {
        return name;
    }

    public long getTime() {
        return time;
    }

    public int getValue() {
        return value;
    }

    public TestResult(String name, long time, int value) {
        this.name = name;
        this.time = time;
        this.value = value;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", time=" + time +
                ", value=" + value +
                '}';
    }
}
