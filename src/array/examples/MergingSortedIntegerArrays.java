package array.examples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MergingSortedIntegerArrays {
    public static void main(String[] args) {

    }
    public static int[] mergeArrays(int[] first, int[] second) {
        Set<Integer> integerSet = new HashSet<>();
        for (int i : first) {
            integerSet.add(i);
        }
        for (int i : second) {
            integerSet.add(i);
        }
        int[] arr = new int[integerSet.size()];
        List<Integer> list = integerSet.stream().toList();
        for (int i = 0; i < integerSet.size(); i++) {
            arr[i]=list.get(i);
        }
        return Arrays.stream(arr).sorted().toArray();
    }
}
