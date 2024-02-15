package array.examples;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MeanOfArray {
    public static void main(String[] args) {

    }

    public static int getAverage(int[] marks) {
   /*     int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        return sum/marks.length;*/
       return (int)Arrays.stream(marks).average().orElse(Double.NaN);
    }
}
