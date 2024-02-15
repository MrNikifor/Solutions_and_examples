package booleans;

public class CountingSheep {
    public static void main(String[] args) {
        Boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true };

        System.out.println(countSheeps(array1));
    }
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if(arrayOfSheeps[i] == null){
                continue;
            }
            if(arrayOfSheeps[i]){
                count++;
            }
        }
        return count;


        //return Collections.frequency(Arrays.asList(arrayOfSheeps), true);

        // return Arrays.stream(arrayOfSheeps).filter(x -> x != null).filter(x -> x == true).toArray().length;
    }
}
