package array.examples;

import java.util.Arrays;

public class FindMultiplesNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(find(5, 25)));
    }
    public static int[] find(int base, int limit) {
        int[] arr = new int[limit/base];
        int sum = base;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sum;
            sum+=base;
        }
        return arr;

        // return IntStream.rangeClosed(base, limit).filter(n -> n % base == 0).toArray();
    }
}
