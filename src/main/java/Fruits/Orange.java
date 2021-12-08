package Fruits;

public class Orange implements Fruit{
    public final double FRUIT_WEIGHT = 1.5;

    @Override
    public double getFruitWeight() {
        return FRUIT_WEIGHT;
    }
}
