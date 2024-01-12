package collections.list.arraylist.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.sort;

/*ПОМОЩЬ! Джейсон не может найти свой учебник! До даты экзамена осталось два дня, а учебники Джейсона вышли из строя!
 Помогите ему отсортировать список (ArrayList в Java),
 полный учебников по предметам, чтобы он мог подготовиться перед тестом.

Сортировка НЕ ​​должна быть чувствительной к регистру*/
public class SortMyTextbooks {
    public static void main(String[] args) {
        String[] one = new String[]{"Algebra", "History", "feometry", "English"};

        System.out.println(sorted(List.of(one)));
    }

    public static List<String> sorted(List<String> textbooks) {
        return textbooks.stream().sorted(String::compareToIgnoreCase).collect(Collectors.toList());
    }

    public static List<String> sorted1(List<String> name) {
        Comparator.comparing(name ::get,String.CASE_INSENSITIVE_ORDER);
        return name;
    }

}
//        names.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return Integer.compare(o1.length(), o2.length());
//            }
//        });

//       return names.stream().sorted((o1, o2) -> o1.length() - o2.length()).toList();
