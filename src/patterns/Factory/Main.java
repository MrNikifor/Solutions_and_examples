package patterns.Factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
// патерн Фабрика позволяет генереровать несколько разных объектов по неоходимости предавая генерации ту логику которая
// будет необходима
public class Main {
    public static void main(String[] args) {
        Random rnd = ThreadLocalRandom.current();
        List<iItemGenerator> genList = new ArrayList<>();
        genList.add(new GoldGenerator());
        genList.add(new GemGenerator());

        for(int i=0;i<10;i++)
        {
            int indexFabric = Math.abs(rnd.nextInt()%2==0?0:1) ;

            iItemGenerator item1 = genList.get(indexFabric);
            item1.openRerward();

        }

    }
}
