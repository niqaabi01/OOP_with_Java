import java.util.*;

class Question2 {
    public static void main(String args[]) {
        System.out.println("Welcome to Great International Food Court");
        Scanner scan = new Scanner(System.in);
        String option;
        List<food> decisions = new ArrayList<>(5);

        do {
            System.out.println("MENU: add (P)izza, add (C)urry, add (S)oft drink, (D)elete, (L)ist, (Q)uit");
            option = scan.next().toUpperCase();
            // Pizza
            if ("P".equals(option)) {
                System.out.println("Pizza");
                System.out.println("Enter the menu item number");
                int menuNum = scan.nextInt();
                System.out.println("Enter the size ");
                String sizeP = scan.next();
                System.out.println("Enter the base ");
                String base = scan.next();
                System.out.println("Enter extra cheese");
                String cheese = scan.next();
                System.out.println("Enter extra garlic");
                String garlic = scan.next();
                System.out.println("Done");
                food pizza =new Pizza(menuNum, sizeP, base, cheese, garlic);
                decisions.add(pizza);





                //Curry
            } else if ("C".equals(option)) {
                System.out.println("Curry");
                System.out.println("Enter the menu item number");
                int numC = scan.nextInt();
                System.out.println("Enter the size ");
                String sizeC = scan.next();
                System.out.println("Enter the curry type ");
                String c_t = scan.next();
                System.out.println("Done");
                food curry = new Curry(numC, sizeC, c_t);
                decisions.add(curry);



                //Soft drink
            } else if ("S".equals(option)) {
                System.out.println("Soft Drink");
                System.out.println("Enter the menu item number");
                int numDrink = scan.nextInt();
                System.out.println("Enter the size ");
                String sizeDrink = scan.next();
                System.out.println("Enter the flavour");
                String flavDrink = scan.next();
                System.out.println("Enter whether it is a bottle or can");
                String bot_can = scan.next();
                System.out.println("Done");
                food softDrink = new SoftDrink(numDrink, sizeDrink, flavDrink, bot_can);
                decisions.add(softDrink);





            } else if ("D".equals(option)) {
                System.out.println("Delete");
                int i = scan.nextInt();
                if(i  == 123){
                    decisions.remove(0);
                }
                if(i == 456){
                    decisions.remove(1);

                }
                if(i == 789) {
                    decisions.remove(2);
                }


            } else if ("L".equals(option)) {
                for(food order: decisions) {
                    System.out.println(order);
                }
            } else if ("Q".equals(option)) {
                break;
            }
        }while (!option.equals("Q"));







    }
}