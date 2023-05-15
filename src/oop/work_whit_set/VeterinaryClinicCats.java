package oop.work_whit_set;

import java.util.HashSet;
import java.util.Set;

public class VeterinaryClinicCats {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Бигозя",2,"Сиамская","Вариборщь А.П.");
        Cat cat2 = new Cat("Муся",1,"Хикси","Осинская В.Н.");
        Cat cat3 = new Cat("Нака",3,"Шотладская","Баранова А.У.");
        Cat cat4 = new Cat("Рыжик",2,"Дворовой","Кричалкина Т.Ю.");
        Cat cat5 = new Cat("Муся",1,"Хикси","Осинская В.Н.");
        cat1.setWeight(0.45);
        cat2.setSex("Девочка");
        /*System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
        System.out.println(cat4);
        System.out.println(cat5);*/

        Set<Cat> catSet = new HashSet<>();
        catSet.add(cat1);
        catSet.add(cat2);
        catSet.add(cat3);
        catSet.add(cat4);
        catSet.add(cat5);
        System.out.println(catSet);
       // System.out.println(cat2.equals(cat5));
    }
}
