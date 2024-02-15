package array.examples;

import java.util.Arrays;

public class CountOfPositivesAndSumOfNegatives {
    public static void main(String[] args) {
        int[] array = new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14};
        System.out.println(Arrays.toString(countPositivesSumNegatives(array)));
    }
    public static int[] countPositivesSumNegatives(int[] input){
        if (input == null || input.length == 0) {
            return new int[]{};
        }
        int count = 0;
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            if(input[i] > 0){
                count++;
            }else{
                sum += input[i];
            }
        }
        return new int[]{count,sum};

        //return input == null || input.length == 0 ?
        //      new int[0] :
        //      new int[] { (int)IntStream.of(input).filter(i->i>0).count(), IntStream.of(input).filter(i->i<0).sum() };
    }
}
