package array.examples;

import java.util.Arrays;

/*
1)написать класс который будет генерировать массив целых чисел
2)написать класс который будет замерять время выполнения методов
3)написать класс BubbleSort, где реализовать сортировку пузырьком

4)написать класс Main, где будет генериироваться массив из класса(1),
будет выполняться сортировка(3) и будет замеряться время(2).
*/
public class Main {
    public static void main(String[] args) {
        int[] arra = GenerateArray.generateArrNumbers(10);
        long start = ExecuteByTime.start();
        System.out.println(start);
        System.out.println(Arrays.toString(BubbleSort.sorted(arra)));
        System.out.println(ExecuteByTime.finish(start));

    }
}
