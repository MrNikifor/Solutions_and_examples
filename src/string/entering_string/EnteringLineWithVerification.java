package string.entering_string;

import java.util.LinkedList;
import java.util.Scanner;
// Задача: Принемает от пользователя строку в виде text~num.
// Нужно рассплитить строку по ~, сохранить строку в связанный список на позицию num.
// Если введено print~num, выводит строкуиз позиции num в связанном списке и удоляет ее из списка.
public class EnteringLineWithVerification {
    public static void main(String[] args) {
        String[] inputArr;
        String input = "test~0";
        Scanner sc = new Scanner(System.in);
        LinkedList<String> Storage = new LinkedList<>(); // Storage - хранилище
        while (!input.equals("exit")){
            System.out.println("Введите текст: ");
            input = sc.nextLine();
            inputArr = input.split("~");

            if (!inputArr[0].equals("print")){
                if(Storage.size() < Integer.parseInt(inputArr[1]));{
                    for (int i = Storage.size(); i < Integer.parseInt(inputArr[i]); i ++){
                        Storage.add(null);
                    }
                }
                Storage.add(Integer.parseInt(inputArr[1]), inputArr[0]);
                System.out.println(Storage);
            }
            else {
                System.out.println(Storage.get(Integer.parseInt(inputArr[1])));
                Storage.remove(Integer.parseInt(inputArr[1]));
            }
        }
    }
}
