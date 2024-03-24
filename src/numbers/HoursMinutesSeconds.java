package numbers;
/*
Напишите программу, которая получает на вход с клавиатуры целое число.
Это число представляет собой текущее суточное время как количество прошедших с полуночи секунд.
Затем программа должна напечатать вывод экрана электронных часов для этого времени.
Входное значение задается через System.in. Выходное значение должно быть напечатано в System.out
Гарантируется, что входное значение — неотрицательное.
Формат вывода: h:mm:ss (возможные значения: [0:00:00; 23:59:59]).
Попробуйте решить задачу без использования if и циклов, даже если вы с ними уже знакомы.
Sample Input:
60
Sample Output:
0:01:00
*/


import java.util.Scanner;

public class HoursMinutesSeconds {
    public static void main(String[] args) {
        // решение 1
       /* Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) /60;
        int seconds1 = seconds  % 60;
        String hours1 = (hours < 24)? "" + hours: (hours==24)? "0" :Integer.toString(hours) ;
        System.out.printf ( hours1 + ":" + "%02d:%02d", minutes, seconds1);*/

        // решение 2
       /* Scanner sc = new Scanner(System.in);
        int num1 = (sc.nextInt())%86400;

        int h = num1 / 3600;
        int m = num1 / 60 % 60;
        int s = num1 /1 % 60;
        System.out.printf("%1d:%02d:%02d",h, m, s);*/

        // решение 3
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(n/3600%24+":"+n%3600/60/10+n%3600/60%10+":"+n%60/10+n%60%10);
        sc.close();
    }

}
