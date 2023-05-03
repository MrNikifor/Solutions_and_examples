package collections.list.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Написать метод, который принемает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка
// Написать метод, который принемает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди
public class WorkStackQueue {
    public static void main(String[] args) {
        int[] arr = new int[]{21, 33, 1, 6, 89, 61, 123};
        System.out.println(getStack(arr).getClass());
        System.out.println(getStack(arr) + "\n");
        System.out.println(getQueue(arr).getClass());
        System.out.println(getQueue(arr));
    }

    private static Stack<Integer> getStack(int[] array) {
        Stack<Integer> myStack = new Stack<>();
        for (int i : array) {
            myStack.add(i);
        }
        return myStack;
    }

    private static Queue<Integer> getQueue(int[] array) {
        Queue<Integer> myQueue = new LinkedList<>();
        for (int i : array) {
            myQueue.add(i);
        }
        return myQueue;
    }
}
