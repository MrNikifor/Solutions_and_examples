package string;

public class WorkWithSubstring {
    public static void main(String[] args) {
        String s = "123456789";

        String substring = s.substring(s.length() - 4, s.length());

        System.out.println(s.replaceAll(substring, ""));
    }
}
