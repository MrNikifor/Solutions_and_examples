package string;

import java.util.List;

/*Дынны следующие строки, сравнить их с помощью == и методом equals() класса Object:
* String s1 = "hello"
* String s2 = "hello"
* String s3 = "s1"
* String s4 = "h" + "e" + "l" + "l" + "o"
* String s5 = new String("hello")
* String s6 = new String(new char[]{'h','e','l','l','o'})*/
public class ComparisonEquals {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 ="h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h','e','l','l','o'});
        System.out.println(s1.equals(s2));
        List<String> stringList = List.of(s1,s2,s3,s4,s5,s6);
        for (String str : stringList) {
            System.out.println("Равны ли через equals s1 и " + str + " " + s1.equals(str));
        }
        System.out.println();
        for (String str : stringList) {
            System.out.println("Равны ли через == s1 и " + str + " " + (s1 == str));
        }
    }
}
