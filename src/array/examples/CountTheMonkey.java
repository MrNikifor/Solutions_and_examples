package array.examples;

import java.util.Arrays;

public class CountTheMonkey {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(monkeyCount(5)));
    }

    public static int[] monkeyCount(final int n) {
       /* int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        return arr;*/
        int[] arr = new int[n];
        Arrays.setAll(arr, index -> index + 1);
        return arr;
    }
}
