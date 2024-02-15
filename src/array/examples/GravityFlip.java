package array.examples;


import java.util.Arrays;

public class GravityFlip {
    public static void main(String[] args) {

    }

    public static int[] flip(char dir, int[] arr) {
        Arrays.sort(arr);
        if (dir == 'L') {
            for (int i = 0; i < arr.length / 2; i++) {
                    int temp = arr[i];
                    arr[i] = arr[arr.length - i -1];
                    arr[arr.length - i -1] = temp;
            }
            return arr;
        }else
            return arr;
    }
}
