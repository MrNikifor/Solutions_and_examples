package collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SpeedTestArrayAndLinked {
    public static void main(String[] args) {
        List<Integer> arraylist = new ArrayList<>();
        long startTimeArray = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++){
            arraylist.add(0);
        }
            long endTimeArray = System.nanoTime();
        System.out.println(endTimeArray - startTimeArray);
        List<Integer> linkedList = new LinkedList<>();
        long startTimeLinked = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            linkedList.add(0);
        }
        long endLinkedList = System.nanoTime();
        System.out.println(endLinkedList - startTimeLinked);
    }
}
