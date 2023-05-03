package collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;
// Задача
// Создать структуру для хранения номеров Паспортов и Фамилии сотрудников оргпнизации.
// Вывести данные по сотрудникам с фамилией Иванов.

// Решение
public class ValueOutput {
    public static void main(String[] args) {
        Map<Integer, String> people = new HashMap<>();
        people.put(2378912,"Иванов");
        people.put(2023546,"Вариборьщ");
        people.put(2657562,"Клопов");
        people.put(7567520,"Иванов");
        people.put(2234002,"Голубев");
        people.put(9781200,"Иванов");
        people.put(8787612,"Ропанов");
        people.put(2376865,"Иванов");
        people.put(7694312,"Лагутин");
        people.put(2313752,"Кукин");
        if (people.containsValue("Иванов")){ // containsValue - проверка значения
            for (Integer number : people.keySet()) {
                if(people.get(number).equals("Иванов"))
                System.out.println(people.get(number)+ ":" + " номер паспорта - " + number);
            }

        }else {
            System.out.println("Нет сотрудника с такой фамилией.");
        }
    }
}
