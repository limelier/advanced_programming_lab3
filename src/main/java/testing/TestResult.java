package testing;

public class TestResult {
    String name;
    long time;
    int value;

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
