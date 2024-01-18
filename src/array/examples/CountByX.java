package array.examples;

import java.util.Arrays;

public class CountByX {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBy(2, 5)));
    }

    public static int[] countBy(int x, int n) {
        int[] arr = new int[n];
        for (int i = 0, j = 1; i < n; i++,j++) {
            arr[i] = j * x;
        }
        return arr;
    }
}
