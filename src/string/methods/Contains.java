package string.methods;

public class Contains {
    public static void main(String[] args) {
        String str_Sample = "This is a String contains Example";
        //Check if String contains a sequence
        System.out.println("Contains sequence 'ing': " + str_Sample.contains("ing"));


        System.out.println("Contains sequence 'Example': " + str_Sample.contains("Example"));
        //String contains method is case sensitive
        System.out.println("Contains sequence 'example': " + str_Sample.contains("example"));
        System.out.println("Contains sequence 'is String': " + str_Sample.contains("is String"));

    }
}
// Вывод:

       /* Contains sequence ‘ing’: true
          Contains sequence ‘Example’: true
          Contains sequence ‘example’: false
          Contains sequence ‘is String’: false*/

