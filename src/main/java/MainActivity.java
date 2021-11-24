
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*
Task:
Необходимо написать два метода, которые делают следующее:
1) Создают одномерный длинный массив, например:
static final int SIZE = 10_000_000;
static final int HALF = size / 2;
float[] arr = new float[size];

2) Заполняют этот массив единицами.
3) Засекают время выполнения: long a = System.currentTimeMillis().
4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:
arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
5) Проверяется время окончания метода System.currentTimeMillis().
6) В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a).

 */

public class MainActivity {
    static final int SIZE = 10000;
    static final int TEST_SIZE = 10;
    static long currentTimeMillis;
    static double[] array = new double[SIZE];

    public static void main(String[] args) {
        initArray();
        changeArrayValue();
        printArray();
        System.out.println("Время работы программы:");
        System.out.println(System.currentTimeMillis() - currentTimeMillis);
    }

    static void initArray() {
        currentTimeMillis = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            array[i] = 1;
        }
    }

    static void changeArrayValue() {
        for (int i = 0; i < SIZE; i++) {
            array[i] = (double) (array[i] * Math.sin(0.2 + i / 5) * Math.cos(0.2 + i / 5) * Math.cos(0.4 + i / 2));
        }
    }
    static void printArray() {
        for (int i = 0; i < TEST_SIZE; i++) {
            System.out.println(i + 1 + ": " + array[i]);
        }
    }
}
