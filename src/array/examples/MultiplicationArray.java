package array.examples;

import java.util.Arrays;
//перемножаем элементы массива
public class MultiplicationArray {
    public static void main(String[] args) {

    }

    public static int grow(int[] x) {
      /*  int mult = 1;
        for (int i = 0; i < x.length; i++) {
            mult *= x[i];
        }*/
        return Arrays.stream(x).reduce(1,(a,b) -> a * b);
    }
}
