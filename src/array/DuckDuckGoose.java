package array;

import java.sql.Array;

public class DuckDuckGoose {
    public static void main(String[] args) {
        Player[] players = makePlayerArr(new String[]{"a", "b", "c", "d", "c", "e", "f", "g", "h", "z"});
        System.out.println(duckDuckGoose(players, 11));
    }
    public static String duckDuckGoose(Player[] players, int goose) {
        int position = goose % players.length;
        return position == 0 ? players[players.length -1].name : players[position -1].name;
    }


    private static Player[] makePlayerArr(String[] names) {
        Player[] players = new Player[names.length];
        for (int i = 0; i < names.length; i++) {
            players[i] = new Player(names[i]);
        }
        return players;
    }
}

class Player {
    String name;

    public Player(String name) {
        this.name = name;
    }


}
