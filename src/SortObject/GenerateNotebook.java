package SortObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateNotebook {
    private static final Random RANDOM = new Random();
     public static List<Notebook> generate(int count){
         List<Notebook> notebookList = new ArrayList<>();

         for (int i = 0; i <= count; i++) {
             notebookList.add(generateNetbook());
         }
         return notebookList;
     }
     private static String generateCompany(){
         String[] strArr = {"Asos", "MacNote","Eser","Xamiou"};
         int genIndex = RANDOM.nextInt(0,3);
         return strArr[genIndex];
     }
     private static int generatePrice(int min, int max,int step){
       return generateNumber(min, max, step);
     }
    private static int generateRam(int min, int max,int step){
        return generateNumber(min, max, step);

    }
    private static int generateNumber(int min, int max,int step){
        int range = (max - min) / step + 1;
        return RANDOM.nextInt(range) * step + min;
    }
    private static Notebook generateNetbook(){
         return new Notebook(
                 generateCompany(),
                 generatePrice(500,2000,50),
                 generateRam(4,24,2)
         );
    }
}
