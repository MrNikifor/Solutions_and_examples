package collections.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Пусть дан произвольный список целых чисел, удалить из него чётные числа.
public class RemovingEvenNumbers {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        offEvenNum(myList);
    }
 //Решение 1
    public static void offEvenNum(List<Integer> list) {
        Iterator<Integer> iter = list.iterator(); //Iterator - интерфейс в коллекции позволяющий идти по коллекции и удалять элементы
        while (iter.hasNext()) { // hasNext - следующий элемент( в условии если он имеется)
            if (iter.next() % 2 == 0) iter.remove();
        }
        // Решение 2
        list.removeIf(n -> (n % 2 == 0)); // removeif - удалить если и в (через лямду что будем удалять).
        System.out.println(list);
    }

}
