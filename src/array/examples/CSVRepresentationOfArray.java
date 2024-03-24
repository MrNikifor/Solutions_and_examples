package array.examples;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

public class CSVRepresentationOfArray {
    public static void main(String[] args) {
        System.out.println(toCsvText(new int[][]{
                {0, 1, 2, 3, 45},
                {10, 11, 12, 13, 14},
                {20, 21, 22, 23, 24},
                {30, 31, 32, 33, 34}}));
    }


    public static String toCsvText(int[][] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                stringBuilder.append(array[i][j] + ",");
            }
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString().trim();
    }
    public static String toCsvText1(int[][] array) {
     return stream(array).
             map(r -> stream(r).
                     mapToObj(i -> i + "").
                     collect(joining(","))).
                     collect(joining("\n"));
    }
}



/*
input:
   [[ 0, 1, 2, 3, 4 ],
    [ 10,11,12,13,14 ],
    [ 20,21,22,23,24 ],
    [ 30,31,32,33,34 ]]

output:
     "0,1,2,3,4\n10,11,12,13,14\n20,21,22,23,24\n30,31,32,33,34"
 */