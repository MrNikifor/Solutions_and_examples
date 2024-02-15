package array.examples;

import java.util.Arrays;

public class InvertValues {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(invert2(new int[]{1, -2, 3, -4})));
    }

    public static int[] invert(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                array[i] = 0 - array[i];
            } else {
                array[i] = Math.abs(array[i]);
            }
        }
        return array;
    }

    public static int[] invert1(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * -1;
        }
        return array;
    }

    public static int[] invert2(int[] array) {
        return Arrays.stream(array).map(x -> -x).toArray();
    }
}

