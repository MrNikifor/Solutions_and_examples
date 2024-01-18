package SortObject;

import java.util.List;

/*Отсортировать массив, состоящий из экземпляров класса Notebook в количестве
10000 штук.
Условия для сортировки: 1) по цене. От 500 до 2000 долларов с шагом в 50 если цена равная, то 2) по кол-ву оперативной памяти (от 4 до 24 с шагом 4) если памяти тоже равное количество, то 3) по производителю: Lenuvo ›
Asos > MacNote > Eser > Xamiou Добиваться максимально оптимальной сложности О-большая*/
public class Main {
    public static void main(String[] args) {
        List<Notebook> generate = GenerateNotebook.generate(10);
        generate.sort(new SortedNetbook());
        for (Notebook notebook : generate) {
            System.out.println(notebook.toString());
        }

    }

}
