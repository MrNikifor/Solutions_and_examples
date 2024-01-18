package array.examples;

public class ExecuteByTime {
 //   System.currentTimeMillis();
    public static long start(){
       return System.currentTimeMillis();
    }
    public static long finish(long start){
        return System.currentTimeMillis() - start;
    }
}
