//Пусть дан список сотрудников:
//        Иван Иванов
//        Светлана Петрова
//        Кристина Белова
//        Анна Мусина
//        Анна Крутова
//        Иван Юрин
//        Петр Лыков
//        Павел Чернов
//        Петр Чернышов
//        Мария Федорова
//        Марина Светлова
//        Мария Савина
//        Мария Рыкова
//        Марина Лугова
//        Анна Владимирова
//        Иван Мечников
//        Петр Петин
//        Иван Ежов
//        Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
//        Отсортировать по убыванию популярности.

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Task02 {
    public static void main(String[] args) {
        String employees_string = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, " +
                "Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, " +
                "Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";
        String[] employees_string2 = employees_string.split(", ");
        Map<Integer, String> employees = new HashMap<>();
        int key = 1;
        // Наполнение словаря employees сотрудниками
        for (String item : employees_string2) {
            employees.put(key, item);
            key += 1;
        }
        System.out.println("Список сотрудников:");
        for (Map.Entry<Integer, String> item : employees.entrySet()) {
            System.out.printf("Сотрудник: %s \n", item.getValue());
        }
        // Наполнение словаря sorted_names именами и их количеством
        Map<String, Integer> sorted_names = new HashMap<>();
        for (String item : employees_string2) {
            String[] names = item.split(" ");
            if (sorted_names.containsKey(names[0])) {
                int count = sorted_names.get(names[0]);
                count += 1;
                sorted_names.replace(names[0], count);
            } else {
                sorted_names.put(names[0], 1);
            }
        }
        System.out.println();
        System.out.println("Имена и количество повторений:");
        int max_count = 1;
        for (Map.Entry<String, Integer> item : sorted_names.entrySet()) {
            System.out.printf("Имя: %s  Количество: %d \n", item.getKey(), item.getValue());
            if (item.getValue() > max_count) max_count = item.getValue();
        }
        System.out.println();
        System.out.println("Сортирую в порядке убывания популярности имени:");
        Map<Integer, String> sorted_employees = new HashMap<>();
        key = 1;
        for (int i = 0; i < sorted_names.size(); i++) {
            ArrayList<String> massive = new ArrayList<>();
            for (Map.Entry<String, Integer> item : sorted_names.entrySet()) {
                if (item.getValue() == max_count) {
                    for (String items : employees_string2) {
                        if (items.split(" ")[0].equals(item.getKey())) {
                            massive.add(items);
                        }
                    }

                }
            }
            Collections.sort(massive);
            for (String itemes : massive) {
                sorted_employees.put(key, itemes);
                key += 1;
            }
            max_count -= 1;
        }
        for (Map.Entry<Integer, String> item : sorted_employees.entrySet()) {
            System.out.printf("Сотрудник: %s \n", item.getValue());
        }
    }
}