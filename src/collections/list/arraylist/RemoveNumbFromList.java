package collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

/*Создать список типа ArrayList<String>. Поместить в него как строки так и целые числа.
Пройти по списку найти и удалить целые числа.*/
public class RemoveNumbFromList {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList<>();
        mylist.add("7");
        mylist.add("s");
        mylist.add("d");
        mylist.add("4");
        mylist.add("d");
        mylist.add("a");
        mylist.add("2");
        List<String> mylist2 = new ArrayList<>();
        for (String item :mylist) {
            try {
                Integer.parseInt(item);// исключаем числа из строки
            }
            catch (Exception e){
                mylist2.add(item);// создаем оставшиеся символы в строку
            }
        }
        System.out.println(mylist2);
    }
}
