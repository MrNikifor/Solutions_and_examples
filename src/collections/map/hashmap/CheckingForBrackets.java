package collections.map.hashmap;
/*Написать програму, определяющих правельность растановки скобок в вырвжении.
Пример1:a+(b*3) - true
Пример2:[a+(1*3)- false
Пример3:[6+(3*3)] - true
Пример4:{a}[+]{d*3} - true
Пример5:<{a}+{(d*3)}> - true
Пример6:{a+]}{(d*3)} - false
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CheckingForBrackets {
    public static void main(String[] args) {
        String chekStr = "[6+(3*3)";
        System.out.println(findBrackets(chekStr));
    }

    private static boolean findBrackets(String str) {
        Map<Character,Character> pairs = new HashMap<>();// создаем проверяемые пары
        pairs.put('(',')');
        pairs.put('[',']');
        pairs.put('{','}');
        pairs.put('<','>');
        Stack<Character> states = new Stack<>();// создаем проверочное состояние
        for (int i = 0; i < str.length(); i++) {
            char el = str.charAt(i);// берем символ строки
            if (pairs.containsKey(el)){// если нашли символ ключа в парах(pairs)
                states.push(pairs.get(el)); // то закидываем символ из проверяемых пар в проверочное состояние
            }
            else if(pairs.containsValue(el)){ // если нашли символ значения в парах
                // если стек пустой и нет скобки(которая может быть в строке лишняя), то возвращаем false
                if(states.isEmpty()){
                    return false;
                    // если символ не равен последнему елементу проверочного stack, то возвращаем false
                }else if(el != states.pop()){
                    return false;
                }
            }
        }return states.isEmpty();// и после всех проверок если проверочный stack пустой то вернет на значение true
    }

}
