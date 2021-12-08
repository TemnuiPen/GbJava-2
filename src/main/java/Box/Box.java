package Box;

import java.util.ArrayList;

public class Box {
    static private String fruitType;
    static private double fruitWeight;
    static private double boxWeight;
    static private int amount;
    static private ArrayList<Double> boxes = new ArrayList<>();
    static private ArrayList<String> boxType = new ArrayList<>();

    public static double getWeight() {
        boxWeight = fruitWeight * amount;
        boxes.add(boxWeight);
        boxType.add(fruitType);
        return boxWeight;
    }
    public static boolean compare(double someBoxWeight) {
        return boxWeight > someBoxWeight;
    }
    public static double changeBox(String type, double value) {
        if(fruitType.equals(type)) {
            boxWeight = value + boxWeight;
            return boxWeight;
        }
        else {
            return value;
        }
    }
    public static void addFruits(double weight, double amount, String type) {
        amount += amount;
        fruitType = type;
        fruitWeight = weight;
    }
}
