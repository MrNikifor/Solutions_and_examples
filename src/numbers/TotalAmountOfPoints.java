package numbers;

public class TotalAmountOfPoints {
    public static void main(String[] args) {

    }

    public static int points(String[] games) {
        int summ = 0;
        for (int i = 0; i < games.length; i++) {
            if (games[i].charAt(0) > games[i].charAt(2)) {
                summ += 3;
            }
            if(games[i].charAt(0) == games[i].charAt(2)){
                summ+=1;
            }
        }
        return summ;
    }
}
