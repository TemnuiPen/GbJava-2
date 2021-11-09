
import MyExceptions.MyArrayDataException;
import MyExceptions.MyArraySizeException;

import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;

public class MainClass {
    static int[][] intArray = new int[4][4];
    static int arraySum = 0;
    static String[][] stringArray = {
            {"1", "3", "2", "3"},
            {"2", "4", "3", "4"},
            {"3", "5", "4", "5"},
            {"4", "6", "5", "6"}
    };
    final static int ARRAY_SIZE = stringArray.length;

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        checkArraySize(stringArray);
        System.out.println(arraySum);
    }

    static void checkArraySize(String[][] stringArray) throws MyArraySizeException, MyArrayDataException {
        int checkInnerArray;
        int checkOuterArray  = 0;
        for(int i = 0; i < ARRAY_SIZE; i++) {
            checkInnerArray = 0;
            for(int j = 0; j < ARRAY_SIZE; j++) {
                checkInnerArray++;
            }
            if (checkInnerArray != 4) {
                throw new MyArraySizeException();
            }
            else {
                checkOuterArray++;
            }
        }
        if(checkOuterArray!= 4) {
            throw new MyArraySizeException();
        }
        parseToInt(stringArray);
    }

    static void parseToInt(String[][] stringArray) throws MyArrayDataException {
        for(int i = 0; i < ARRAY_SIZE; i++) {
            for(int j = 0; j < ARRAY_SIZE; j++) {
                boolean flag = false;
                for(int a = 0; a < 10; a++) {
                    if(stringArray[i][j].equals(a + "")) {
                        flag = true;
                    }
                }
                if(flag) {
                    intArray[i][j] = Integer.parseInt(stringArray[i][j]);
                    arraySum = arraySum + intArray[i][j];
                }
                else {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
    }
}
