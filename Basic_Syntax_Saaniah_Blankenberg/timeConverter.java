import java.sql.Time;
import java.util.Arrays;
import java.util.Scanner;

public class timeConverter {
    public static void main(String[]args){
        System.out.println("Enter a time ([h]h:mm [am|pm])");
        Scanner scan = new Scanner(System.in);
        String time = scan.nextLine();
         String substring = "m";


         if (time.contains(substring)){
             //splitting the string at ":"
             String tArr[] = time.split(":");
             String Time = tArr[1].substring(3,5);

             int hh,mm;
             //converting the strings to integers
             hh = Integer.parseInt(tArr[0]);
             mm = Integer.parseInt(tArr[1].substring(0,2));


             String check_pm = "pm",check_am ="am";


             if(Time.equals(check_am) && hh==12)
             {
                 hh=0;
             }
             else if(Time.equals(check_pm)&& hh<12)
             {
                 hh+=12;
             }
             System.out.printf("%02d:%02d\n",hh,mm);

         }

         //for 24 hour format to 12 hour format with am/pm
         else {
             String tArr[] = time.split(":");
             int hh,mm;
             //converting the strings to integers
             hh = Integer.parseInt(tArr[0]);
             mm = Integer.parseInt(tArr[1]);

             if ( hh ==12){
                 hh = 0;
                 System.out.printf("%02d:%02d",hh,mm);
                 System.out.print("am");
             }

             else if ( hh ==00) {
                 hh = 12;
                 System.out.printf("%02d:%02d", hh, mm);
                 System.out.print(" am");
             }

             else if (hh <= 11){
                 hh = hh;
                 System.out.printf("%d:%02d",hh,mm);
                 System.out.print(" am");

             }


             else if ( hh >12){
                 hh-=12;
                 System.out.printf("%d:%02d",hh,mm);
                 System.out.print(" pm");

             }
         }


    }
}
