package string;
/*Задание 1
Данно четное число N(>0) и символы c1 и с2.
Написать метод который вернет строку N, которая состоит из следующих символов с1 и с2, начиная с с1.

Задание 2
Напишите метод который сжимает строку.
Вход: aaaabbbcdd
Выход: abcd
*/
public class StringExamples {
    public static void main(String[] args) {
        // System.out.println(sumString(5));
        System.out.println(stringCompress("aaaabbbbcddd"));
    }
    // Задание 1
    public static String sumString(int n){
        String c1 = "Сережа";
        String c2 = "Альбина";
        String resul = "";
        for (int i = 0; i < n; i++) {
//              if(i % 2 == 0)  resul += c1;
//              else resul += c2;
              resul += i % 2 == 0 ? c1 : c2; // Запись тернарного оператора
        }
        return resul;
    }
    // Задание 2
    public static String stringCompress(String str){
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(res.indexOf(ch) == -1) res += ch;
        }return res;
    }
}
