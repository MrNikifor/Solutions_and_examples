package collections.list.arraylist;

import java.util.*;

/*1)Заполните список названиями Солнечной системы в произвольном порядку с повторениями.
 * Вывести на экран название планет и количество его повторения в списке
 *
 * 2)Проити по списку планет и удалить повторяющиеся элементы*/
public class RepetitionsDeleteRepetitions {
    // Решение 1 (Задание 1)
    public static void main(String[] args) {
        List<String> mylist = new ArrayList<>();
        mylist.add("Венера");
        mylist.add("Плутон");
        mylist.add("Земля");
        mylist.add("Марс");
        mylist.add("Сатурн");
        mylist.add("Сатурн");
        mylist.add("Марс");
        mylist.add("Юпитер");
        mylist.add("Уран");
        mylist.add("Уран");
        mylist.add("Плутон");
        mylist.add("Нептун");
        mylist.add("Земля");
        mylist.add("Марс");
        Set<String> myset = new HashSet<>(mylist); //  убираем повторяющиеся объекты с помошью HasSet<>
        for (String quantity : myset) {
            // с помощи frequency возвращаем общее количество элементов в списке mylist
            System.out.println(quantity + " - " + Collections.frequency(mylist, quantity));
        }
        // Решение 1 (Задание 2)
        // System.out.println(myset);
        // Решение 2 (Задание 2)
        // System.out.println(mylist.stream().distinct().toList());
        // Решение 3 (Задание 2)
        for (int i = 0; i < mylist.size(); i++) {
            for (int j = 1; j < mylist.size(); j++) {
                if (mylist.get(i).equals(mylist.get(j))) {
                    mylist.remove(j);
                }
            }
        }
        System.out.println(mylist);
    }
}
