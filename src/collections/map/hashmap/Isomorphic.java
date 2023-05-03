package collections.map.hashmap;

import java.util.HashMap;

// Данны две строки написать метод, который вернет true, если эти две строки являются изоморфными и false усли нет.
public class Isomorphic {
    public static void main(String[] args) {
        System.out.println(testIsomorphic());
    }

    private static boolean testIsomorphic() {
        String str1 = "coot";
        String str2 = "doet";
        HashMap<Character,Character> testIsmorph = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            Character ch1 = str1.charAt(i);
            Character ch2 = str2.charAt(i);
            if(!testIsmorph.containsKey(ch1)) testIsmorph.put(ch1,ch2);
            else {
                if(testIsmorph.get(ch1) != ch2) return false;
            }

        }
        return true;
    }

}
