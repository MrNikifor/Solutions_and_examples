package collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*1.Напишите метод который заполнит массив из 1000 элементов случайными цыфрами от 0 до 24
* 2.Создайте метод, в который передайте выше заполненый массив и с помощью Set вычеслите процент уникальных значений
* в данном массиве и верните его в виде числа с плавающей запятой.*/
public class WorkingWithArrayAndSet {
    public static void main(String[] args) {
       // System.out.println(Arrays.toString(generateTntArray(1000)));
        Integer[] myArray = generateTntArray(1000);
        System.out.println(getPercentUniques(myArray));
    }
    //Создаем метод(массив) из 1000 элементов с случайными цыфрами от 0 до 24
    public static Integer[] generateTntArray(int arraySize){
        Integer[] generArray = new Integer[arraySize];
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            generArray[i] = random.nextInt(24);
        }
        return generArray;
    }
    // Создаем метод, который с момощи HeshSet берет уникальные элементы из масива и вычесляем процент по отношению к массиву
    public static Double getPercentUniques(Integer[] inputArray){
        Set<Integer> inputSet = new HashSet<>(Arrays.asList(inputArray));
        // переводим из итежера в дабл с помощью строки и вычесляем процент
        return Double.parseDouble(String.valueOf(inputSet.size())) * 100 / inputArray.length;
    }


}
