package string;
// Определить слово полиндром или нет.
public class PalindromeRevers {
    public static void main(String[] args) {
        // Решение
        String str = "А роза упала на лапу азора";
        if(palindrome(str)) System.out.println(str + " - ваше слово полиндром");
        else System.out.println(str + " - ваше слово не полиндром");
    }
    public static boolean palindrome(String x){
        // убираем пробелы, преобразуем в нижний регистр
        String notSpase = x.replace(" ", "").toLowerCase();
        // слова преобразуем в массив символов
        char[] notSpChar = notSpase.toCharArray();
        // проходим слово по циклу до середины и сравниваем
        for (int i = 0; i < notSpChar.length/2; i++) {
            if (notSpChar[i] != notSpChar[notSpChar.length - i -1]) return false;
        }
        return true;
    }
}
