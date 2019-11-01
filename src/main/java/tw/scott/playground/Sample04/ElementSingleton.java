package tw.scott.playground.Sample04;

public class ElementSingleton {
    private static ElementSingleton instance = null;
    private int power;

    private ElementSingleton(int power) {
        this.power = power;
    }

    public static ElementSingleton getInstance() {
        if (instance == null) {
            instance = new ElementSingleton(1000);
        }
        return instance;
    }

    public int getPower() {
        return power;
    }
}
