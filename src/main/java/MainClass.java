
import MyExceptions.MyArraySizeException;

import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;

public class MainClass {
    static String[][] stringArray = {
            {"1", "hello", "2", "3"},
            {"2", "world", "3", "4"},
            {"3", "!", "4", "5"},
            {"4", "@", "5", "6"}
    };
    public static void main(String[] args) throws MyArraySizeException {
        checkArraySize(stringArray);
    }

    static void checkArraySize(String[][] stringArray) throws MyArraySizeException {
        int checkInnerArray = 0;
        int checkOuterArray  = 0;
        int arraySize = stringArray.length;
        for(int i = 0; i < arraySize; i++) {
            for(int j = 0; j < arraySize; j++) {
                checkInnerArray++;
            }
            if (checkInnerArray != 4) {
                throw new MyArraySizeException();
            }
        }
    }
}
