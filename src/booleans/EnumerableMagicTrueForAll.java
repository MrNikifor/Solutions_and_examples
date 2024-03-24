package booleans;

import java.util.function.IntPredicate;

public class EnumerableMagicTrueForAll {
    public static void main(String[] args) {

    }
    public static boolean all(int[] list, IntPredicate predicate){
        for (int i = 0; i < list.length; i++) {
            if(!predicate.test(list[i])){
                return false;
            }
        }return true;
    }

    /* private static final IntPredicate evenNumber = n -> n % 2 == 0;
    private static final IntPredicate oddNumber = n -> n % 2 != 0;
    private static final IntPredicate lessThan10 = n -> n < 10;
    private static final IntPredicate lessThan5 = n -> n < 5;
    private static final IntPredicate greaterThan1 = n -> n > 1;
    private static final IntPredicate greaterThan5 = n -> n > 5;
    private static final IntPredicate greaterThan10 = n -> n > 10;*/
}
