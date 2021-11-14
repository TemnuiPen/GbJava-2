
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*
Task:
1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
Посчитать, сколько раз встречается каждое слово.
2. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи,
а с помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией
может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем
через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного справочника.
 */

public class MainActivity {
    static PhoneNumberList phoneNumberList = new PhoneNumberList();
    static String[] stringArray = {
            "Hello",
            "world",
            "We",
            "world",
            "live",
            "in",
            "Hello"
    };
    static ArrayList<String> uniqueArray = new ArrayList<>();
    static HashMap<String, Integer> quantityOfValue = new HashMap<>();
    public static void main(String[] args) {
        for(int i = 0; i < stringArray.length; i++) {
            if(quantityOfValue.containsKey(stringArray[i])) {
                quantityOfValue.put(stringArray[i],quantityOfValue.get(stringArray[i]) + 1);
            } else {
                quantityOfValue.put(stringArray[i], 1);
                uniqueArray.add(stringArray[i]);
            }
        }
        System.out.println("Уникальные слова:");
        System.out.println(uniqueArray);
        System.out.println("Всего слов в массиве");
        System.out.println(quantityOfValue);
        System.out.println("Первое задание выполнено");
        System.out.println("____________________________________________________________________________");
        System.out.println("");

        System.out.println("Второе задание");
        phoneNumberList.add("key1", "3388");
        phoneNumberList.add("key2", "4477");
        phoneNumberList.add("key3", "5599");
        phoneNumberList.add("key1", "6660");
        System.out.println(phoneNumberList.get("key1"));
    }
}
