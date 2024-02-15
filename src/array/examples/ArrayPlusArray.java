package array.examples;

import java.util.Arrays;

public class ArrayPlusArray {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3};
        int[] arr2 = new int[]{4,5,6};
        System.out.println(Arrays.toString(new int[]{arrayPlusArray(arr1, arr2)}));
    }
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            sum += arr2[j];
        }

        return sum;
    }
}
