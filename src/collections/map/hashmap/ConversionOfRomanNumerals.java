package collections.map.hashmap;
// Задача
// Написать метод который переводит из римского формата записи в арабский.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// Решение
public class ConversionOfRomanNumerals {
    public static void main(String[] args) {
        Map<Character, Integer> convert = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        convert.put('I', 1);
        convert.put('V', 5);
        convert.put('X', 10);
        convert.put('L', 50);
        convert.put('C', 100);
        convert.put('D', 500);
        convert.put('M', 1000);

        String inputStr = "XIV";
        char ch;
        int sum = 0;

        for (int i = 0; i < inputStr.length(); i++) {
            ch = inputStr.charAt(i);
            list.add(convert.get(ch));
        }
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) < list.get(i + 1)){
                sum -= list.get(i);
            }else {
                sum += list.get(i);
            }

        }
        sum += list.get(list.size() - 1);
        System.out.println(sum);
    }

}
