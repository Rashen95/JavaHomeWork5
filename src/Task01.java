//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.Map;

public class Task01 {
    public static void main(String[] args) {
        Map<Long, String> numbers = new HashMap<>();
        numbers.put(89381134495L, "Привалов Артем Витальевич");
        numbers.put(76276L, "Привалов Артем Витальевич");
        numbers.put(89281853437L, "Сергеев Алексей Сергеевич");
        numbers.put(89281853555L, "Алехин Дмитрий Степанович");
        numbers.put(89281853439L, "Моисеева Оксана Сергеевна");
        numbers.put(89281853556L, "Берков Михаил Владимирович");
        numbers.put(89281853434L, "Людоедов Канибал Семенович");
        numbers.put(89281853551L, "Алексеева Нина Федоровна");
        numbers.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        // Сортировка и вывод по значению
    }
}