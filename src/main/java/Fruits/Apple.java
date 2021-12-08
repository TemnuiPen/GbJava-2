package Fruits;

public class Apple implements Fruit{
    public final double FRUIT_WEIGHT = 1;

    @Override
    public double getFruitWeight() {
        return FRUIT_WEIGHT;
    }
}
