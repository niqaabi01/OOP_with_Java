package Zaio.deliverables;//ImperialMetric.java
import java.util.Scanner;
public class ImperialMetric {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    //getting user input
        System.out.println("Enter the minimum number of feet(not less than 0)");
        String user_input1 =input.next();
        int min_feet =Integer.parseInt(user_input1);

        System.out.println("Enter the maximum number of feet(not more than 30)");
        String user_input2 =input.next();
        int max_feet = Integer.parseInt(user_input2);
        System.out.print("\n   |    0\"    1\"    2\"    3\"    4\"    5\"    6\"    7\"     8\"    9\"  10\"   11\" \n");
        // to check the range
        for (int i = min_feet; i <= max_feet; i++){
            System.out.print(i+ "'");
            System.out.print(" |");
            // to calculate the meters
            for (int inches = 0; inches<=11; inches ++){
                System.out.printf("%6.3f",(i*12+inches)*0.0254);
            }
            System.out.println("");

        }

    }
}
