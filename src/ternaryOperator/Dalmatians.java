package ternaryOperator;

public class Dalmatians {
    public static void main(String[] args) {
        System.out.println(howManyDalmations(26));
        System.out.println(howManyDalmations(8));
        System.out.println(howManyDalmations(14));
        System.out.println(howManyDalmations(80));
        System.out.println(howManyDalmations(100));
        System.out.println(howManyDalmations(101));
    }
    public static String howManyDalmations(int number) {
        String[] dogs =  {"Hardly any", "More than a handful!", "Woah that's a lot of dogs!", "101 DALMATIONS!!!"};

        String respond = number <= 10 ? dogs[0]: number <= 50 ? dogs[1] : number == 101 ? dogs[3] : dogs[2];

        return respond;
    }


}
