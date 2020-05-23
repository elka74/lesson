package task_2;

import java.util.*;

public class Phonebook extends HashMap {
    private static String num;
    private static String myList;
    public static Map<String, ArrayList<String>> map = new HashMap<>();
    public static List<String> list = new ArrayList<>();

    public Phonebook() {
    }

    public static void main(String[] args) {
        addPhoneBook("Иванов", "89765433345");
        addPhoneBook("Иванов", "89866546790");
        addPhoneBook("Гаврилов", "89458674536");
        addPhoneBook("Михеева", "89152630934");
        addPhoneBook("Гаврилов", "89034567382");
        addPhoneBook("Иванов", "9643457283");
        info();
        System.out.println("Иванов - " + map.get("Иванов"));

    }

    public static void addPhoneBook(String myList, String num) {
        map.computeIfAbsent(myList, k ->
                new ArrayList<>()).add(num);

    }

    @Override
    public Object get(Object key) {
        return super.get(key);
    }

    static void info() {
        map.forEach((k, v) ->
                System.out.println("ключ = " + k + " , значение = " + v));

    }

}


