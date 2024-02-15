package string.example;

public class ReversedString {
    public static void main(String[] args) {
        String n = "Misha";
        System.out.println(solution(n));
    }

    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String solution1(String str) {
        // Your code here...
        String newcad = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            newcad += str.charAt(i);
        }

        return newcad;
    }
}