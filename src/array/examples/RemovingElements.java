package array.examples;

import java.util.ArrayList;
import java.util.List;

public class RemovingElements {
    public static void main(String[] args) {

    }
    public static Object[] removeEveryOther(Object[] arr) {
        if(arr.length == 0 || arr == null){
            return new Object[]{};
        }
        if(arr.length <= 2){
            return arr;
        }
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if((i % 2) == 0){
              list.add(arr[i]);
            }
        }
        return list.toArray();
    }
    public static Object[] removeEveryOther1(Object[] arr) {
        Object[] output = new Object[(arr.length + 1) / 2];

        for (int i = 0; i < output.length; i++) {
            output[i] = arr[i * 2];
        }

        return output;
    }
}
