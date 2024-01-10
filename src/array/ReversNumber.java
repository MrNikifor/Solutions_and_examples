package array;

import java.util.Arrays;

public class ReversNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(12345)));
    }
    public static int[] digitize(long n) {
      String s = String.valueOf(n);
      int[] arr = new int[s.length()];
        for (int i = 0, j = arr.length -1; i < arr.length; i++, j--) {
            arr[i] = Integer.parseInt(String.valueOf(s.charAt(j)));
        }
        return arr;
    }
}
