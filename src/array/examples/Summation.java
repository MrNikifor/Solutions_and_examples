package array.examples;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Summation {
    public static void main(String[] args) {
        System.out.println((summation(3)));
    }
    public static int summation(int n) {
        /*int[] arr = new int[n];
        Arrays.setAll(arr,index -> 1 + index);
        int sum = 0;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;*/
        return IntStream.range(1,1 + n).sum();
    }
}
