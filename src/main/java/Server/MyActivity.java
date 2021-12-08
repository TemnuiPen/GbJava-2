package Server;



import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
Task:
1)Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
2) Написать метод, который преобразует массив в ArrayList;
3) Задача:
    a) Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
    b) Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну
    коробку нельзя сложить и яблоки, и апельсины;
    c) Для хранения фруктов внутри коробки можно использовать ArrayList;
    d) Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
    вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
    e) Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут
    в compare() в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать
    коробки с яблоками и апельсинами;
    f) Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов:
    нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую п
    ерекидываются объекты, которые были в первой;
    g) Не забываем про метод добавления фрукта в коробку.

 */

public class MyActivity {
    private static Integer[] someArray = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private static List<Object> someArrayList = new ArrayList<>();
    private static HashMap<String, Double> boxValues = new HashMap<>();

    public static void main(String[] args) throws IOException {
        // задания 1 и 2
        changeElementPosition(0,9);
        String[] arrayForTest = {
                "hello",
                "world!"
        };
        changeArrayToArrayList(someArray);
        changeArrayToArrayList(arrayForTest);
        // задание 3

    }
    private static void changeElementPosition(int firstIndex, int secondIndex) {
        int firstNumber = someArray[firstIndex];
        int secondNumber = someArray[secondIndex];
        someArray[firstIndex] = secondNumber;
        someArray[secondIndex] = firstNumber;
        System.out.println("Array:");
        System.out.println(Arrays.toString(someArray));
    }
    private static void changeArrayToArrayList(Object[] someArray) {
        someArrayList = Arrays.asList(someArray);
        System.out.println("ArrayList:");
        System.out.println(someArrayList);
    }

}
