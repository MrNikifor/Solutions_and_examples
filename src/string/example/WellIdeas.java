package string.example;

public class WellIdeas {
    public static void main(String[] args) {

    }

    public static String well(String[] x) {
        int count = 0;
        for (String arg : x) {
            if ("good".equals(arg)) {
                count++;
            }
       /*
        if(count==0){
            return "Fail!";
        }
        if(count <= 2){
            return "Publish!";
        }else {
            return "I smell a series!";
        }*/
        }
        return count==0 ? "Fail!":(count<=2? "Publish!":"I smell a series!");
    }
}
