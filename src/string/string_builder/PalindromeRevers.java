package string.string_builder;
// Определить слово полиндром или нет.
public class PalindromeRevers {
    public static void main(String[] args) {
        // Решение 1
        String str = "А роза упала на лапу азора";
        if(palindrome(str)) System.out.println(str + " - ваше слово полиндром");
        else System.out.println(str + " - ваше слово не полиндром");

    }
    // Решение 1
    /*
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
    }*/
    public static boolean palindrome(String str1){
        // преобразуем в нижний регистр, убираем пробелы
        str1 = str1.toLowerCase().replace(" ", "");
        // строку приобразуем в StringBuilder, переворачивам и преобразуем обратно в строку
        String revers_str = new StringBuilder(str1).reverse().toString();
        // сравниваем  строки с помощи equals на символы
        return str1.equals(revers_str);
    }

}
