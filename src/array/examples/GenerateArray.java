package array.examples;

import java.util.Random;

public class GenerateArray {
    private static final Random RAND = new Random();
    private static int[] arr;

    public static int[] generateArrNumbers(int size){
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = RAND.nextInt(-50,50);
        }
        return arr;
    }
}
