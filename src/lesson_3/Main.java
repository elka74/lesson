package lesson_3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] list = {"Мария", "Анастасия", "Андрей", "Мария", "Игорь", "Андрей", "Анастасия", "Мария", "Александр", "Анастасия", "Елена"};

        Map<String, Integer> hm = new HashMap<>();
        for (String str : list) {
            hm.put(str, hm.getOrDefault(str, 0) + 1);

        }
        System.out.println(hm);
    }

}



