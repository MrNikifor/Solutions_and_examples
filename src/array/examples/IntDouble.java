package array.examples;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntDouble {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(map(arr)));
    }

    /*   public static int[] map(int[] arr) {
           for (int i = 0; i < arr.length; i++) {
               arr[i] *= 2;
           }
           return arr;
       }*/
    public static int[] map(int[] arr) {
       return Arrays.stream(arr).map(x -> x * 2).toArray();
    }
}
