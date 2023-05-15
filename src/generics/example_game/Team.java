package generics.example_game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participants> {
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }
    public void addNewParticipant(T part){
        participants.add(part);
        System.out.println("В команду: " + "*" + name + "*" + " добавлен новый участник по именни: " + part.getName());
    }
     public void playWith(Team<T> team){
        String winnerName;
         Random random = new Random();
         int i = random.nextInt(2);
         if (i == 0){
             winnerName = this.name;
         }
         else {
             winnerName = team.name;
         }
         System.out.println("Выйграла команда - " + winnerName);
     }
}
