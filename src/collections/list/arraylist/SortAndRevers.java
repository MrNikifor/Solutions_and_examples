package collections.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
// Заполнить список 10ю случайными числами. Отсортировать его и развернуть.
public class SortAndRevers {
    public static void main(String[] args) {
        List<Integer> testList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            testList.add(new Random().nextInt(0,10));
        }
        System.out.println(testList);
        Collections.sort(testList);
        System.out.println(testList);
        Collections.reverse(testList);
        System.out.println(testList);
    }
}
