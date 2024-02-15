package string.chararr;
//import org.apache.commons.lang3.StringUtils;
public class AllStarCodeChallenge18 {
    public static void main(String[] args) {

    }

    public static int strCount(String str, char letter) {
     /*   int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == letter){
                count++;
            }
        }
        return count;*/

        /*  for(char character : str.toCharArray()) {
      if(letter == character) {
        counter++;
      }*/


             return (int) str.chars().filter(x -> x == letter).count();


        //   return StringUtils.countMatches(str,letter);
    }
}
