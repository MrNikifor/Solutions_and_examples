package array.examples;

import java.util.Arrays;
import java.util.Optional;

public class SumWithoutMinMax {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{6}));
    }

    public static int sum(int[] numbers) {
        if (numbers == null){
            return 0;
        }
        Arrays.sort(numbers);
        int sum = 0;
        for (int i = 1; i < numbers.length - 1; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static int sum1(int[] numbers) {
        if (numbers == null || numbers.length < 2) return 0;
        return Arrays.stream(numbers).sorted().skip(1).limit(numbers.length - 2).sum();
    }
}
