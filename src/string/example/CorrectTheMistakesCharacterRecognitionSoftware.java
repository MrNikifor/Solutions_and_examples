package string.example;

import java.util.stream.IntStream;

public class CorrectTheMistakesCharacterRecognitionSoftware {
    public static void main(String[] args) {

    }
    public static String correct(String string) {
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == '5'){
                string = string.replace(string.charAt(i), 'S');
            }if(string.charAt(i) == '0'){
                string = string.replace(string.charAt(i), 'O');
            }if(string.charAt(i) == '1'){
                string = string.replace(string.charAt(i),'I');
            }
        }return string;
    }
    public static String correct1(String string) {
        return string.chars()
                .flatMap(ch -> (ch == '5') ? "S".chars() :(ch == '0') ? "O".chars():(ch == '1') ? "I".chars():IntStream.of(ch))
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
