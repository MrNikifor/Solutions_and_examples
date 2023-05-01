package string.entering_string;

import java.util.LinkedList;
import java.util.Scanner;

// Принемает от пользователя и "запоминает" строки.
// Если введен print, выводит строки так чтобы последняя введеная строка в списке была первой, а первая  - последней.
// Если введен revert, удаляет предыдущую введенную строку из памяти.
public class EnteringLineWithVerification2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> myLinked = new LinkedList<>();
        String str = "";
        while (!str.equals("quit")) {
            str = sc.nextLine();
            if (str.equals("print")) {
                String temp;
                temp = myLinked.getFirst();
                myLinked.set(0,myLinked.getLast());
                myLinked.set(myLinked.size()-1,temp);
                System.out.println(myLinked);
            } else if (myLinked.size() > 0 && str.equals("revert")) {
                myLinked.remove(myLinked.size() - 1);
                System.out.println(myLinked);
            } else if (str.equals("quit")) {
                System.out.println(myLinked);
                System.exit(0);
            } else {
                myLinked.add(str);
            }
        }
        System.out.println(myLinked);
    }

}
