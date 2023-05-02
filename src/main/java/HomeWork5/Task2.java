//2) Пусть дан список сотрудников:
//
//        Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

package HomeWork5;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        showNames(personals);
    }

    public static List<String> personals = new ArrayList<>(Arrays.asList(
            "Иван Иванов",
            "Светлана Петрова",
            "Кристина Белова",
            "Анна Мусина",
            "Анна Крутова",
            "Иван Юрин",
            "Петр Лыков",
            "Павел Чернов",
            "Петр Чернышов",
            "Мария Федорова",
            "Марина Светлова",
            "Мария Савина",
            "Мария Рыкова",
            "Марина Лугова",
            "Анна Владимирова",
            "Иван Мечников",
            "Петр Петин",
            "Иван Ежов"
    ));

    public static void removeOneNames(Map<String, Integer> map1) {
        map1.entrySet().removeIf(entry -> entry.getValue() == 1);
    }
    public static void showNames(List<String> personals) {
        Map<String, Integer> map = new HashMap<>();
        for (String personal : personals) {
            String personalFIO = personal.split(" ")[0];
            if (map.containsKey(personalFIO)) {
                map.put(personalFIO, map.get(personalFIO) + 1);
            } else {
                map.put(personalFIO, 1);
            }
        }
        removeOneNames(map);
        List<Map.Entry<String, Integer>> listNames = new ArrayList<>(map.entrySet());
        listNames.sort(Map.Entry.<String, Integer>comparingByValue().reversed());
        System.out.println(listNames);
    }
}
