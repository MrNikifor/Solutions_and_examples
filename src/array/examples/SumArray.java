package array.examples;

public class SumArray {
    public static void main(String[] args) {

    }
    public static double sum(double[] numbers) {
        double sum = 0;
        if(numbers.length == 0 || numbers == null){
            return 0;
        }
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
        /* return Arrays.stream(numbers).sum();*/
    }
}

