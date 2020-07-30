import java.util.ArrayList;
import java.util.List;

public class NumberUtils {

    private NumberUtils() {}

    public static int[] toArray(int number){

        int[]digits =Integer.toString(number).chars().map(c-> c-'0').toArray();
        return digits;

    }
    public static int countMatches(int numberA,int numberB){
        List<Integer> results =new ArrayList<>();
        int[] first = toArray(numberA);
         int[] second = toArray(numberB);
        int size = first.length;
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j < size; j++) {
                if (first[i] == second[i]&&first[j]==second[j]) {
                    results.add(first[i]);
                    break;
                }
            }
        }
        return results.size();
    }

   public static int countIntersect(int numberA, int numberB){
       List<Integer> output =new ArrayList<>();
       int[] first = toArray(numberA);
       int[] second = toArray(numberB);
       for (int value : first) {
           for (int i : second) {
               if (value == i) {
                   output.add(value);
                   break;
               }
           }
       }
       return output.size();
   }
}
