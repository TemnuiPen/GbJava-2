import java.util.HashMap;

public class PhoneNumberList {
    HashMap<String, String> phoneList = new HashMap<>();

    public void add(String key, String value) {
        if(phoneList.containsKey(key)) {
            String str  = phoneList.get(key);
            str = str + "; " + value;
            phoneList.put(key, str);
        }
        else {
            phoneList.put(key, value);
        }
    }
    public String get(String key) {
        return phoneList.getOrDefault(key, "Значения по такому ключу не найдено");
    }
}
