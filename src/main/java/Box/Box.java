package Box;

import java.util.ArrayList;
import java.util.List;

public class Box {
    public Box() {
        //empty slot
    }
    private int index;
    private String fruitType;
    private double fruitWeight;
    private double boxWeight;
    private int amount;
    private List<Double> boxes = new ArrayList<>();
    private List<String> boxType = new ArrayList<>();

    public double getWeight() {
        boxWeight = fruitWeight * amount;
        boxes.add(index, boxWeight);
        return boxWeight;
    }
    public boolean compare(double someBoxWeight) {
        return boxWeight > someBoxWeight;
    }
    public double changeBox(String type, double weight) {
        if(fruitType.equals(type)) {
            boxWeight = boxWeight + weight;
            boxes.set(index, boxWeight);
            return boxWeight;
        }
        else {
            boxes.set(index, weight);
            boxType.set(index,type);
            fruitType = type;
            boxWeight = weight;
            return weight;
        }
    }
    public void addFruits(double weight, int amount, String type, int index) {
        this.amount += amount;
        fruitType = type;
        fruitWeight = weight;
        this.index = index;
        boxType.add(index,fruitType);
    }
}
