package array.examples;

public class BubbleSort {
    public static int[] sorted(int[] arr) {
        boolean isChang;
        do  {
            isChang = false;
            for (int i = 0; i < arr.length -1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isChang = true;
                }
            }

        }while (isChang);
        return arr;
    }
}
/*public static void sort(Integer[] arr) {
        boolean isChange;
        int limit = arr.length;
        do {
            limit--;
            isChange = false;
            for (int i = 0; i < limit; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isChange = true;
                }
            }
//            System.out.println(limit + " " + Arrays.toString(arr));
        }while (isChange);
    }*/
