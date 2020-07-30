import java.util.*;

/**
 * Question2 code given to students for Assignment 7
 */
public class Question1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int option;
        List<String> drinks = new ArrayList<String>();
        do {
            System.out.println("Enter options: (1) add soft drink (2) quit");
            option = s.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter name, colour and volume in ml separated by space");
                    Scanner scanner =new Scanner(System.in);
                    String list =scanner.nextLine();
                    String[] arroflist=list.split(" ",3);
                    drinks.add(String.valueOf(new SoftDrinks(arroflist[0],arroflist[1],arroflist[2])));

                    break;
            }
        } while (option != 2);

        Collections.sort(drinks);
        for (int i = 0; i < drinks.size(); i++) {
            System.out.println(drinks.get(i));
        }



    }


}
