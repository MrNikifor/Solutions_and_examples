package string.example;

import java.util.List;

public class ParsedStringArray {
    public static int sum(List<?> mixed) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (Object o : mixed) {
            sb.append(o);
        }
        String newString = sb.toString();
        for (int i = 0; i < newString.length(); i++) {
            sum += Integer.parseInt(String.valueOf(newString.charAt(i)));
        }

        return sum;
        //return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
    }
}
