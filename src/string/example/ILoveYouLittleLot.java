package string.example;

import java.util.ArrayList;
import java.util.List;

public class ILoveYouLittleLot {

    public static void main(String[] args) {
        System.out.println(howMuchILoveYou(35));
        System.out.println(howMuchILoveYou(36));

    }

    public static String howMuchILoveYou(int nb_petals) {
        List<String> str = new ArrayList<>();
        str.add("I love you");
        str.add("a little");
        str.add("a lot");
        str.add("passionately");
        str.add("madly");
        str.add("not at all");
        return nb_petals % 6 - 1 == -1 ? str.get(5) : str.get(nb_petals % 6 - 1);
        /*  String[] arr ={"not at all", "I love you",  "a little", "a lot", "passionately", "madly"};

      return arr[nb_petals%6];*/
    }
}
