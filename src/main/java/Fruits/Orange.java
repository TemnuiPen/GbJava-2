package Fruits;

public class Orange implements Fruit{
    public Orange() {
        //empty slot
    }
    private final double FRUIT_WEIGHT = 1.5;
    private final String FRUIT_TYPE = "Orange";

    @Override
    public double getFruitWeight() {
        return FRUIT_WEIGHT;
    }

    @Override
    public String getFruitType() {
        return FRUIT_TYPE;
    }
}
