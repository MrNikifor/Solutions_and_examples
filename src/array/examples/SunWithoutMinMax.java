package array.examples;

import java.util.Arrays;
import java.util.Optional;

public class SunWithoutMinMax {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{6, 2, 1, 8, 10}));
    }

    public static int sum(int[] numbers) {
        if (numbers == null){
            System.out.println(Optional.ofNullable(null));
        }
        Arrays.sort(numbers);
        int sum = 0;
        for (int i = 1; i < numbers.length - 1; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
