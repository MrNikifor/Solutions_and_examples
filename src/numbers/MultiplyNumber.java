package numbers;

public class MultiplyNumber {
    public static void main(String[] args) {
        System.out.println(multiply(-3));
    }
    public static int multiply(int number) {
        int numberOfDigits = String.valueOf(Math.abs(number)).length();
        return number * (int) Math.pow(5,numberOfDigits);
    }
}
