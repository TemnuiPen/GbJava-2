package Fruits;

public class Apple implements Fruit{
    public Apple() {
        //empty slot
    }
    private final double FRUIT_WEIGHT = 1;
    private final String FRUIT_TYPE = "Apple";

    @Override
    public double getFruitWeight() {
        return FRUIT_WEIGHT;
    }

    @Override
    public String getFruitType() {
        return FRUIT_TYPE;
    }
}
